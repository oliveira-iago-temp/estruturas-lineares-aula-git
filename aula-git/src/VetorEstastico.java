public class VetorEstastico {
    private ExemploObjeto[] vetor;

    public VetorEstastico(int tamanhoVetor) {
        this.vetor = new ExemploObjeto[tamanhoVetor];
    }

    public void adicionarItem(ExemploObjeto objeto) {
        this.vetor[this.vetor.length-1] = objeto;
    }

    public int quantidade() {
        return this.vetor.length;
    }

    public ExemploObjeto buscarPeloId(int id) {
        //Percorre cada item do vetor
        for (int i = 0; i < this.vetor.length; i++) {
            if(this.vetor[i].getId() == id) {
                return this.vetor[i];
            }
        }
        return null;
    }

    public void percorrer() {
        for (int i = 0; i < this.vetor.length; i++) {
            this.vetor[i].imprimir();
        }
    }
}
