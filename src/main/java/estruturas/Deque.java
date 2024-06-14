package estruturas;

import java.util.ArrayList;
import java.util.List;

public class Deque {
    private List<String> deque;
    private int tamanho;

    public Deque(){
        this.deque = new ArrayList<>();
        this.tamanho = 0;
    }

    public void adicionarFinal(String nome){
        this.deque.add(nome);
        this.tamanho++;
    }

    public void adicionarInicio(String nome){
        this.deque.addFirst(nome);
        this.tamanho++;
    }

    public void mostrarItens(){
        for (String item : this.deque){
            System.out.println("Nome do jogo: "+item);
        }
    }

    public void removerFinal(){
        this.deque.removeLast();
        this.tamanho--;
    }

    public void removerInicio(){
        this.deque.removeFirst();
        this.tamanho--;
    }


}
