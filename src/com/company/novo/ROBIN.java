package com.company.novo;

import java.util.ArrayList;
import java.util.List;

public class ROBIN {

    private Integer fatiaDeTempo;

    private double media;
    public ROBIN(List<Processo> lista) {
        this.exec(lista);
    }

    private void exec(List<Processo> processos) {
        int tempoAtual = 0, cont = 0, quantum = 0, tempoRestante = 0;
        List<Processo> prontos     = new ArrayList<>(processos.size());
        List<Processo> finalizados = new ArrayList<>(processos.size());

        MSG msg = new MSG();
        msg.msg("%1.35S","Entrar com Fatia de tempo : ");
        this.fatiaDeTempo = msg.lerNumero();
        
        msg.msg("%1.35S%n","Entrar com o Tempo de execução : ");
        for (Processo processo : processos) {
            msg.msg("%15.5S : ", processo.getId());
            Integer n = msg.lerNumero();
            processo.setTempoExecucao(n);
        }

            while(!processos.isEmpty()){
                Processo processo = processos.get(0);
                prontos.set(0,processo);

                cont++;
            }

    }
}
