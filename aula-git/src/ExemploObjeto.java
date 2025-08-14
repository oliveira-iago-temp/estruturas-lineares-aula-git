public class ExemploObjeto {
    private int id;
    private String nome;
    private double valor;

    public ExemploObjeto(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void imprimir() {
        System.out.println(this.id + " | " + this.nome + " | R$ " + this.valor);
    }
}
