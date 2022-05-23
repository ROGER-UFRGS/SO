package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ListaProcessos extends Escalonador {

    private List<Processo> processos;
    private AtomicInteger acumulador;
    private AtomicInteger contador;

    public ListaProcessos(List<Processo> processos) {
        this.processos = processos;
        this.contador = new AtomicInteger();
        this.acumulador = new AtomicInteger();
    }

    public void menorTempodeExecução(){
        List<Processo> processosOrdenados = new ArrayList<>();
        Processo primeiro = this.processos.get(0);

        this.processos.forEach(processo -> {
            this.processos.forEach(processo1 -> {

            });
        });



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
        processos.forEach(processo -> {
            processo.setTempo_espera(this.contador.get());
//            1° Se menor tempo de execução e se ele já chegou na fila executa ele



            for (int i = 0; i < processo.getTempo_execucao(); i++) {
                processo.setTempo_execucao(i);
//                System.out.println(this.contador.get()+" - "+processo);
                this.contador.getAndIncrement();
            }
//            System.out.println("-----------------------");
        });


        processos.forEach(processo -> {
            acumulador.addAndGet(processo.tempo_espera);
//            System.out.println("Tempo de espera do processo "+processo.getId_processo() +" = "+ processo.tempo_espera);
        });
        BigDecimal media_final = new BigDecimal(0).add(new BigDecimal(acumulador.get())).divide(new BigDecimal(processos.size()));
//        System.out.println("Tempo médio de espera = " + media_final.toString());

    }
}
