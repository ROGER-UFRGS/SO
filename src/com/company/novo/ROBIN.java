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
                for (int i = 0; i < processos.size(); i++) {
                    Processo processo = processos.get(i);
                    quantum = this.fatiaDeTempo;
                    for (int u = 0; u < quantum; u++) {
                        if(processo.getTempoExecucao() > 0){
                            processo.setTempoExecucao(processo.getTempoExecucao() -1);
                        }else if(processo.getTempoExecucao() == 0){
                            processos.remove(processo);
                        }else{

                        }
                        System.out.println(cont+" - "+processo);
                        cont++;
                    }
                }
            }
    }
}
