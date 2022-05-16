package com.company;

public class Processo {
    String id_processo;
    Integer tempo_execucao;
    Integer tempo_espera;
    Integer tempo_restante;
    Integer tempo_chegada;

    public Processo(String id_processo, Integer tempo_execucao) {
        this.id_processo = id_processo;
        this.tempo_execucao = tempo_execucao;
        this.tempo_restante = 0;
    }

    public String getId_processo() {
        return id_processo;
    }

    public void setTempo_espera(int espera) {
        this.tempo_espera = espera;
    }

    public Integer setTempo_execucao(int tempo){
        return this.tempo_restante = this.tempo_execucao - (tempo+1);
    }

    public Integer getTempo_execucao() {
        return tempo_execucao;
    }
    public void mostraProcesso(){
        System.out.println("ID "+this.id_processo);
        System.out.println("TEMPO DE EXECUÇÃO " + this.tempo_execucao);
        System.out.println("-----------------------------------------");
    }

    @Override
    public String toString() {
        return this.id_processo + " - Tempo restante "+ this.tempo_restante;
    }
}
