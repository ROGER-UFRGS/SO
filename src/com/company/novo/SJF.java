package com.company.novo;

import java.util.List;

public class SJF {
    private double media;

    public SJF(List<Processo> list) {
        this.exec(list);
    }

    private void exec(List<Processo> processos) {
        int cont = 0, pos = 0, j = 0, total = 0;
        MSG msg = new MSG();
        msg.msg("%1.35S%n","Entrar com o Tempo de execução : ");
        for (Processo processo : processos) {
            msg.msg("%15.5S : ", processo.getId());
            Integer n = msg.lerNumero();
            processo.setTempoExecucao(n);
        }

        for (cont = 0; cont < processos.size(); cont++) {
            pos = cont;
            for(j=cont+1; j < processos.size();j++){
                if(processos.get(j).getTempoExecucao() < processos.get(pos).getTempoExecucao()) pos = j;
                Processo temporario = processos.get(cont);
                processos.set(cont,processos.get(pos));
                processos.set(pos,temporario);
            }
        }

        for (cont = 1; cont < processos.size(); cont++) {
            processos.get(cont).setTempoEspera(0);
            for (j = 0; j < cont ; j++) {
                processos.get(cont).setTempoEspera(processos.get(cont).getTempoEspera()+processos.get(j).getTempoExecucao());
            }
            total += processos.get(cont).getTempoEspera();
        }
        this.media = (float) total / processos.size();
        total = 0;
        msg.mostraHeaderTabela();
        processos.forEach(msg::mostrarTabela);
        msg.mostraMedia(media);
    }
}
