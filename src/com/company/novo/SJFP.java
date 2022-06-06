package com.company.novo;

import java.util.List;

public class SJFP {

    private double media;

    public SJFP(List<Processo> lista) {
        this.exec(lista);
    }

    private void exec(List<Processo> processos) {
        int cont, j, total = 0, total_completo = 0, pos, temp, i;


        MSG msg = new MSG();
        msg.msg("%1.35S%n", "Entrar com o Tempo de execução : ");
        for (Processo processo : processos) {
            msg.msg("%15.5S : ", processo.getId());
            Integer n = msg.lerNumero();
            processo.setTempoExecucao(n);
        }
        msg.msg("%1.35S%n", "Entrar com o Tempo de Chegada : ");
        for (Processo processo : processos) {
            msg.msg("%15.5S : ", processo.getId());
            Integer n = msg.lerNumero();
            processo.setTempoChegada(n);
        }

        for (i = 0; i < processos.size(); i++) {
            pos = i;
            for (j = i + 1; j < processos.size(); j++) {
                if (processos.get(j).getTempoExecucao() < processos.get(pos).getTempoExecucao()) pos = j;
            }
            Processo temporario = processos.get(i);
            processos.set(i, processos.get(pos));
            processos.set(pos, temporario);
        }
        for (i = 1; i < processos.size(); i++) {
            processos.get(i).setTempoCompleto(0);
            for (j = 0; j < i; j++) {
                processos.get(i).setTempoCompleto(processos.get(i).getTempoCompleto() + processos.get(j).getTempoExecucao());
                total_completo += processos.get(i).getTempoCompleto();
            }
        }
        for (i = 1; i < processos.size(); i++) {
            processos.get(i).setTempoEspera(0);
            for (j = 0; j < i; j++) {
                processos.get(i).setTempoEspera(processos.get(i).getTempoEspera() + processos.get(j).getTempoExecucao());
                total += processos.get(i).getTempoEspera();
            }
        }

        this.media = (float) total / processos.size();
        total = 0;
        msg.mostraHeaderTabela2();
        processos.forEach(msg::mostrarTabela2);
        msg.mostraMedia(media);
    }

}
