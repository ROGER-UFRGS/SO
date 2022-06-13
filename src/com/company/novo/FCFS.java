package com.company.novo;

import java.util.List;

public class FCFS {

    private double media;

    public FCFS(List<Processo> l) {
        this.exec(l);
    }

    private void exec(List<Processo> lista){
        int cont = 0;
        MSG msg = new MSG();
        msg.msg("%1.35S%n","Entrar com o Tempo de execução : ");
        for (Processo processo : lista) {
            msg.msg("%15.5S : ", processo.getId());
            Integer n = msg.lerNumero();
            processo.setTempoExecucao(n);
        }
        for (cont = 1; cont < lista.size(); cont++) {
            lista.get(cont).setTempoEspera(lista.get(cont-1).getTempoExecucao() + lista.get(cont -1).getTempoEspera());
            this.media += lista.get(cont).getTempoEspera();
        }
        this.media /= lista.size();
        msg.mostraHeaderTabela();
        lista.forEach(msg::mostrarTabela);
        msg.mostraMedia(media);
    }

}
