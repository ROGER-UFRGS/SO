package com.company.novo;

import java.util.ArrayList;
import java.util.List;


class Escalonador extends MSG {
    private List<Processo> lista;

    public void init_lista(){
        String regex = "%1.30S";
        String s = "Digite o número de processos : ";
        Integer n = this.msg_e_leitura(regex,s);
        this.lista = new ArrayList<>(n);
        for (int i = 0; i < n; i++) this.lista.add(new Processo("P"+(i+1),0,0));
    }

    public void FCFS(){
        this.init_lista();
        new FCFS(this.lista);
    }

    public void SJF(){
        this.init_lista();
        new SJF(this.lista);
    }

    public void SJFP() {
        this.init_lista();
        new SJFP(this.lista);
    }
    public void ROBIN() {
        this.init_lista();
        new ROBIN(this.lista);
    }
}
