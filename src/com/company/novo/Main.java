package com.company.novo;

public class Main {
    private static  void init(){
        Escalonador escalonador = new Escalonador();
        MSG msg = new MSG();
        int opcao;
        loop:while (true){
            msg.msg_menu();
            opcao = msg.lerNumero();
            switch (opcao){
                case  1 :
                    escalonador.FCFS();
                    break;
                case 2 :
                    escalonador.SJF();
                    break;
                case 3 :
                    escalonador.SJFP();
                    break;

                case 4:
                    escalonador.ROBIN();
                    break;

                case 5:

                    break;
                case 6 :
                    break loop;
            }
        }
    }

    public static void main(String[] args) {
       Main.init();
    }
}
