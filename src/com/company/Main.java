package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite o número de processoa");
        int num_processos = new Scanner(System.in).nextInt();
        ArrayList<Processo> processos = new ArrayList(num_processos);

        for (int i = 0; i < num_processos; i++) {
            System.out.println("Digite \n1) Aleatório\n2) Ler tempo");
            int opcao = new Scanner(System.in).nextInt();
            if (opcao == 1) {
                processos.add(new Processo("p"+(i+1),new Random().nextInt(100),0,0));
            }else {
                System.out.println("Digite o tempo de execuçãoo do projeto");
                processos.add(new Processo("p"+(i+1),new Scanner(System.in).nextInt(),0,0));
            }
        }
    }
}
