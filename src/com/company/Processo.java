package com.company;

import java.util.Random;

public class Processo {
    String id_processo;
    Integer tempo_execucao;
    Integer tempo_espera;
    Integer tempo_restante;

    public Processo(String id_processo, Integer tempo_execucao) {
        this.id_processo = id_processo;
        this.tempo_execucao = tempo_execucao;
        this.tempo_restante = 0;
    }


    public void setTempo_espera() {
        this.tempo_espera =  new Random().nextInt(10);
    }


    public void mostraStatusDoProcesso(int tempo){
        System.out.println(this.id_processo+" - Tempo restante "+ (this.tempo_execucao - tempo));
    }

    public Integer getTempo_execucao() {
        return tempo_execucao;
    }
}
