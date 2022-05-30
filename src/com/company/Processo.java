package com.company;

public class Processo {
    String id_processo;
    Integer tempo_execucao;
    Integer tempo_espera;
    Integer tempo_restante;
    Integer tempo_chegada;

    public Integer getTempo_espera() {
        return tempo_espera;
    }

    public Integer getTempo_restante() {
        return tempo_restante;
    }

    public Integer getTempo_chegada() {
        return tempo_chegada;
    }

    public Processo(String id_processo, Integer tempo_execucao) {
        this.id_processo = id_processo;
        this.tempo_execucao = tempo_execucao;
        this.tempo_restante = 0;
    }


    public Processo(String id, Integer tempo_chegada, Integer tempo_execucao){
        this.id_processo = id;
        this.tempo_chegada = tempo_chegada;
        this.tempo_execucao = tempo_execucao;
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

    public Processo maior(Processo p){
        if(this.getTempo_execucao() < p.getTempo_execucao()){
            return this;
        }else{
            return p;
        }
    }

    @Override
    public String toString() {
        return this.id_processo + " - Tempo restante "+ this.tempo_restante;
    }
}
