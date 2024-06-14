package estruturas;

import java.util.ArrayList;
import java.util.List;

public class Fila {

    private List<String> fila;
    private int tamanho;

    public Fila(){
        this.fila = new ArrayList<>();
        this.tamanho = 0;
    }

    public void adicionarFinal(String nome){
        this.fila.add(nome);
        this.tamanho++;
    }

    public void mostrarFila(){
        for (String item : this.fila){
            System.out.println("Nome: "+item);
        }
    }

    public int quantidadeItens(){
        return this.tamanho;
    }

    public void removerInicio(){
        this.fila.removeFirst();
        this.tamanho--;
    }
}
