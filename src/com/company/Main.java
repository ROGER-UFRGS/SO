package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite o número de processos");
        int num_processos = new Scanner(System.in).nextInt();
        ArrayList<Processo> processos = new ArrayList(num_processos);

        for (int i = 0; i < num_processos; i++) {
            System.out.println("Processo "+(i+1)+" Digite \n1) Aleatório\n2) Ler tempo");
            int opcao = new Scanner(System.in).nextInt();
            if (opcao == 1) {
                processos.add(new Processo("p"+(i+1),new Random().nextInt(10)+1));
            }else {
                System.out.println("Digite o tempo de execução do processo");
                processos.add(new Processo("p"+(i+1),new Scanner(System.in).nextInt()));
            }
        }

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
        System.out.println("Tempo médio de espera = "+ acumulador.get() / num_processos);
    }
}
