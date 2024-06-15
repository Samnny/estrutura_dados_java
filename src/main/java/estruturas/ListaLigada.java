package estruturas;

public class ListaLigada {
    private No primeiro;
    private No ultimo;
    private int tamanho;

    public ListaLigada(){
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    public int quantidadeNos(){
        return this.tamanho;
    }

    public void mostrarItens(){
        No no = this.primeiro;
        while (no != null){
            System.out.println("Nome do nó: "+ no.getNome());
            no = no.getProximo();
        }
    }

    public void adicionarFinal(String nomeNo){
        if (tamanho == 0){
            adicionarInicio(nomeNo);
            return;
        }

        No novoNo = new No(nomeNo);
        ultimo.setProximo(novoNo);
        ultimo = novoNo;
        tamanho++;
    }

    public void adicionarInicio(String nomeNo){
        No novoNo = new No(nomeNo);
        novoNo.setProximo(primeiro);

        if (tamanho == 0){
            ultimo = novoNo;
        }

        primeiro = novoNo;
        tamanho++;
    }

    public void adicionarPosicao(String nomeNo, int index){
        No novoNo = new No(nomeNo);
        No noAtual = primeiro;
        No proximoNo = primeiro.getProximo();

        for (int i = 1; i < tamanho; i++) {
            if (i == index) {
                novoNo.setProximo(proximoNo);
                noAtual.setProximo(novoNo);
                return;
            }
            noAtual = proximoNo;
            proximoNo = proximoNo.getProximo();
        }
    }

    public void removerPosicao(int index){
        if (tamanho == 0){
            return;
        }

        if (tamanho == 1){
            removerInicio();
        }

        No noAtual = this.primeiro;
        No proximoNo = this.primeiro.getProximo();
        for (int i = 1; i < tamanho; i++) {
            if (i == index){
                noAtual.setProximo(proximoNo.getProximo());
                proximoNo.setProximo(null);
                return;
            }

            noAtual = proximoNo;
            proximoNo = proximoNo.getProximo();
        }
    }

    public void removerInicio(){
        if (tamanho == 0){
            return;
        }

        this.primeiro = this.primeiro.getProximo();
        tamanho--;
    }
}
