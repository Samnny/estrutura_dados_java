package estruturas;

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

    public void mostrarJogos(){
        for (String item : this.pilha){
            System.out.println("Nome do jogo: "+item);
        }
    }

    public int quantidadeItens(){
        return this.tamanho;
    }

    public void removerInicio(){
        this.pilha.removeFirst();
        this.tamanho--;
    }
}