package principal;

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
    }
}
