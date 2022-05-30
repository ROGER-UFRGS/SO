package com.company;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ListaProcessos extends Escalonador {


    private final Integer TIMELINE = 1000;
    private List<Processo> processos;
    private AtomicInteger acumulador;
    private AtomicInteger contador;

    public ListaProcessos(List<Processo> processos) {
        this.processos = processos;
        this.contador = new AtomicInteger();
        this.acumulador = new AtomicInteger();
    }

    @Override
    public void fcfsList() {
        processos.forEach(processo -> {
            processo.setTempo_espera(this.contador.get());
            processo.mostraProcesso();
            for (int i = 0; i < processo.getTempo_execucao(); i++) {
                processo.setTempo_execucao(i);
                System.out.println(this.contador.get()+" - "+processo);
                this.contador.getAndIncrement();
            }
            System.out.println("-----------------------");
        });
        processos.forEach(processo -> {
            acumulador.addAndGet(processo.tempo_espera);
            System.out.println("Tempo de espera do processo "+processo.getId_processo() +" = "+ processo.tempo_espera);
        });
        BigDecimal media_final = new BigDecimal(0).add(new BigDecimal(acumulador.get())).divide(new BigDecimal(processos.size()));
        System.out.println("Tempo médio de espera = " + media_final.toString());
    }

    @Override
    public void sjfPreemptivo() {


    }

    @Override
    public void sjfNaoPreemptivo() {
        Processo p1 = new Processo("p1", 0, 7);
        Processo p2 = new Processo("p2", 2, 4);
        Processo p3 = new Processo("p3", 4, 1);
        Processo p4 = new Processo("p4", 5, 4);
        final List<Processo> processos = Arrays.asList(p1, p2, p3, p4);

        for (int i = 0; i < TIMELINE; i++) {
            
        }
    }





    @Override
    public void roundRobin() {

    }

    @Override
    public void prioridade() {

    }
}
