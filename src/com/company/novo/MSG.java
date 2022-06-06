package com.company.novo;

import java.util.Scanner;

public class MSG {

    public Integer msg_e_leitura(String regex, String s){
        System.out.printf(regex,s);
        return lerNumero();
    }

    public void msg_menu(){
            String regex = "%20.40S%n%20.10S%n%19.10S%n%21.10S%n%21.10S%n%26.15S%n%20.10S%n%n%1.10S";
            System.out.printf(regex,"***** Escolha o tipo de algoritmo *****","1) fcfs","2) sjf","3) sjf p","4) robin","5) prioridade","6) sair","Opção : ");
    }

    public void msg(String regex, String s){
        System.out.printf(regex,s);
    }

    public Integer lerNumero(){
        return new Scanner(System.in).nextInt();
    }

    public void mostrarTabela(Processo p){
        System.out.printf("%1.5S %15.5S %22.10S%n",p.getId(),p.getTempoExecucao(),p.getTempoEspera());
    }

    public void mostrarTabela2(Processo p){
        System.out.printf("%1.5S %15.5S %22.10S %22.10S%n",p.getId(),p.getTempoExecucao(),p.getTempoEspera(),p.getTempoChegada());
    }

    public void mostraHeaderTabela(){
        System.out.printf("%30S%n","***************TABELA DE PROCESSOS***************");
        System.out.printf("%1.5S %20.10S %20.10S%n","id","execução","espera");
    }

    public void mostraHeaderTabela2(){
        System.out.printf("%30S%n","***************TABELA DE PROCESSOS***************");
        System.out.printf("%1.5S %20.10S %20.10S %20.10S%n","id","execução","espera","chegada");
    }

    public void mostraMedia(double media) {
        System.out.printf("%30S%n","********************* Média *********************");
        System.out.printf("%1.20S %3.2f%n%n","Média de Espera : ",media);
    }

}
