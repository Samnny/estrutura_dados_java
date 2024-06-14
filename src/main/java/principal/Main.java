package principal;

import estruturas.Fila;
import estruturas.Pilha;

public class Main {
    public static void main(String[] args) {

        Pilha pilhaJogos = new Pilha();

        pilhaJogos.adicionarInicio("god of war");
        pilhaJogos.adicionarInicio("pes");
        pilhaJogos.adicionarInicio("rule of rose");
        pilhaJogos.adicionarInicio("gta 5");
        pilhaJogos.mostrarJogos();

        System.out.println("Numero de Jogos: "+pilhaJogos.quantidadeItens());

        pilhaJogos.removerInicio();
        pilhaJogos.removerInicio();
        pilhaJogos.mostrarJogos();

        System.out.println("Numero de jogos: "+pilhaJogos.quantidadeItens());

        System.out.println("-------------------------------------------------");

        Fila filaPessoas = new Fila();

        filaPessoas.adicionarFinal("Ana Carolina");
        filaPessoas.adicionarFinal("Samantha Ferreira");
        filaPessoas.adicionarFinal("Gabriel Lima");
        filaPessoas.adicionarFinal("Pedro Silva");
        filaPessoas.mostrarFila();

        System.out.println("Numero de pessoas: "+filaPessoas.quantidadeItens());

        filaPessoas.removerInicio();
        filaPessoas.removerInicio();
        filaPessoas.mostrarFila();

        System.out.println("Numero de pessoas: "+filaPessoas.quantidadeItens());

    }
}
