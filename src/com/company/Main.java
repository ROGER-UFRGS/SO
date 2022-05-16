package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

        ListaProcessos listaProcessos = new ListaProcessos(processos);
        System.out.println("Digite o tipo do algoritmo de escalonamento\n1) FCFS\n2) SJF PREEMPITIVO\n3) SJF NÃO PREEMPITIVO");
        int opcao = new Scanner(System.in).nextInt();
        switch (opcao){
            case 1:
                listaProcessos.fcfsList();
                break;
            case 2:
                listaProcessos.sjfPreemptivo();
                break;
            case 3:
                listaProcessos.sjfNaoPreemptivo();
                break;

        }
    }
}
