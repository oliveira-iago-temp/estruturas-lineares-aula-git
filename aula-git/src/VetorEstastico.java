public class VetorEstastico {
    private ExemploObjeto[] vetor;
    private int quantidadeItens;

    public VetorEstastico(int tamanhoVetor) {
        this.vetor = new ExemploObjeto[tamanhoVetor];
        this.quantidadeItens = 0;
    }

    public void adicionarItem(ExemploObjeto objeto) {
        if (quantidadeItens < vetor.length) {
            this.vetor[quantidadeItens] = objeto;
            quantidadeItens++;
        } else {
            System.out.println("Vetor cheio. Não é possível adicionar mais itens.");
        }
    }

    public int quantidade() {
        return this.quantidadeItens;
    }

    public ExemploObjeto buscarPeloId(int id) {
        for (int i = 0; i < quantidadeItens; i++) {
            if (this.vetor[i].getId() == id) {
                return this.vetor[i];
            }
        }
        return null;
    }

    public void percorrer() {
        if (quantidadeItens == 0) {
            System.out.println("Vetor vazio.");
            return;
        }
        for (int i = 0; i < quantidadeItens; i++) {
            this.vetor[i].imprimir();
        }
    }
}
