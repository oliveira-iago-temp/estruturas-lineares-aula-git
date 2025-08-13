import java.util.Scanner;

public class Main {
    public static VetorEstastico vetor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem vindo!");
            System.out.println("\nSelecione a opção desejada");
            System.out.println("[1] Novo Vetor");
            System.out.println("[2] Percorrer vetor");
            System.out.println("[3] Buscar item pelo id");
            System.out.println("[4] Quantidade de itens no vetor");
            System.out.println("[5] Sair");

            System.out.print("\nOpção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    novoVetor();
                    break;
                case 2:
                    vetor.percorrer();
                    break;
                case 3:
                    System.out.print("\nid: ");
                    int id = scanner.nextInt();
                    vetor.buscarPeloId(id).imprimir();
                    break;
                case 4:
                    System.out.println("O vetor possui "+vetor.quantidade()+" itens");
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void novoVetor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        vetor = new VetorEstastico(tamanho);

        for (int i=0; i < tamanho; i++) {
            System.out.println("\n---------------------------");
            System.out.println((i+1)+" º Item");

            System.out.print("Informe o id: ");
            int id = scanner.nextInt();

            System.out.print("Informe o nome: ");
            String nome = scanner.next();

            System.out.print("Informe o valor: R$");
            double valor = scanner.nextInt();

            ExemploObjeto novo = new ExemploObjeto(id, nome, valor);
            vetor.adicionarItem(novo);

            System.out.println("Item ["+id+"] adicionado com sucesso!");
        }

        System.out.println("\n\nTodos os itens adicionados!");
    }
}