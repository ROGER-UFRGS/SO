package com.company;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ListaProcessos extends Escalonador {

    private List<Processo> processos;

    public ListaProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    @Override
    public void fcfsList() {
        AtomicInteger acumulador = new AtomicInteger();
        AtomicInteger cont = new AtomicInteger();
        processos.forEach(processo -> {
            processo.setTempo_espera(cont.get());
            processo.mostraProcesso();
            for (int i = 0; i < processo.getTempo_execucao(); i++) {
                processo.setTempo_execucao(i);
                System.out.println(cont+" - "+processo);
                cont.getAndIncrement();
            }
            System.out.println("-----------------------");
        });
        processos.forEach(processo -> {
            acumulador.addAndGet(processo.tempo_espera);
            System.out.println("Tempo de espera do processo "+processo.getId_processo() +" = "+ processo.tempo_espera);
        });
        System.out.println("Tempo médio de espera = "+ acumulador.get() / processos.size());
    }

    @Override
    public void sjfPreemptivo() {

    }

    @Override
    public void sjfNaoPreemptivo() {

    }
}
