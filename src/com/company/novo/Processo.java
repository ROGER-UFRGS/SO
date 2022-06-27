package com.company.novo;

public class Processo {
    private String id;
    private Integer tempoEspera;
    private Integer tempoExecucao;

    private Integer tempoCompleto;

    private Integer tempoChegada;

    public Processo(String id, Integer tempoEspera, Integer tempoExecucao) {
        this.id = id;
        this.tempoEspera = tempoEspera;
        this.tempoExecucao = tempoExecucao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(Integer tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public Integer getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(Integer tempoExecucao) {

        this.tempoExecucao = tempoExecucao;
    }

    public Integer getTempoCompleto() {
        return tempoCompleto;
    }

    public void setTempoCompleto(Integer tempoCompleto) {
        this.tempoCompleto = tempoCompleto;
    }

    public Integer getTempoChegada() {
        return tempoChegada;
    }

    public void setTempoChegada(Integer tempoChegada) {
        this.tempoChegada = tempoChegada;
    }

    @Override
    public String toString() {
        return "id='" + id + '}';
    }
}
