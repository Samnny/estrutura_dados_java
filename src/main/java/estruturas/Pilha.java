package org.example;


import java.util.ArrayList;
import java.util.List;

public class Pilha {
    private List<String> pilha;
    private int tamanho;

    public Pilha(){
        this.pilha = new ArrayList<>();
        this.tamanho = 0;
    }

    public void adicionarInicio(String nomeJogo){
        this.pilha.addFirst(nomeJogo);
        this.tamanho++;
    }

    public void mostrarItens(){
        for (String item : this.pilha){
            System.out.println("Nome do jogo: "+item);
        }
    }
}