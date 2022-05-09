package com.company;

public class Processo {
    String id_processo;
    Integer tempo_execucao;
    Integer tempo_espera;
    Integer tempo_restante;

    public Processo(String id_processo, Integer tempo_execucao, Integer tempo_espera, Integer tempo_restante) {
        this.id_processo = id_processo;
        this.tempo_execucao = tempo_execucao;
        this.tempo_espera = tempo_espera;
        this.tempo_restante = tempo_restante;
    }

    public String getId_processo() {
        return id_processo;
    }

    public void setId_processo(String id_processo) {
        this.id_processo = id_processo;
    }

    public Integer getTempo_execucao() {
        return tempo_execucao;
    }

    public void setTempo_execucao(Integer tempo_execucao) {
        this.tempo_execucao = tempo_execucao;
    }

    public Integer getTempo_espera() {
        return tempo_espera;
    }

    public void setTempo_espera(Integer tempo_espera) {
        this.tempo_espera = tempo_espera;
    }

    public Integer getTempo_restante() {
        return tempo_restante;
    }

    public void setTempo_restante(Integer tempo_restante) {
        this.tempo_restante = tempo_restante;
    }
}
