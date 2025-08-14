import java.util.Scanner;

public class Main {
    public static VetorEstastico vetor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
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

                //Percorrer vetor
                case 2:
                    percorrerVetor();
                    break;

                //Buscar pelo ID
                case 3:
                    buscarItemPorId();
                    break;

                //Quantidade de itens no vetor
                case 4:
                    mostrarQuantidadeItensVetor();
                    break;

                //Sair
                case 5:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
            //Aguarda alguns segundos
            try {
                Thread.sleep(2000); // aguarda 3 segundos
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void novoVetor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n==== NOVO VETOR ====");
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        vetor = new VetorEstastico(tamanho);

        for (int i = 0; i < tamanho; i++) {
            System.out.println("\n---------------------------");

            int id = i+1;
            System.out.println((i + 1) + "º Item | id: "+id);

            System.out.print("Informe o nome: ");
            String nome = scanner.next();

            System.out.print("Informe o valor: R$");
            double valor = scanner.nextDouble();

            ExemploObjeto novo = new ExemploObjeto(id, nome, valor);
            vetor.adicionarItem(novo);

            System.out.println("Item (" + id + ") adicionado com sucesso!");
        }

        System.out.println("\n\nTodos os itens adicionados!");
    }

    public static void percorrerVetor() {
        System.out.println("\n==== PERCORRER VETOR ====");
        if (vetor != null) {
            vetor.percorrer();
        } else {
            System.out.println("\nCrie um vetor primeiro.");
        }
    }

    public static void buscarItemPorId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==== BUSCAR POR ID ====");
        if (vetor != null) {
            System.out.print("\nid: ");
            int id = scanner.nextInt();
            ExemploObjeto encontrado = vetor.buscarPeloId(id);
            if (encontrado != null) {
                encontrado.imprimir();
            }
            else {
                System.out.println("Item não encontrado.");
            }
        }
        else {
            System.out.println("Crie um vetor primeiro.");
        }
    }

    public static void mostrarQuantidadeItensVetor() {
        if (vetor != null) {
            System.out.println("O vetor possui " + vetor.quantidade() + " itens");
        }
        else {
            System.out.println("Crie um vetor primeiro.");
        }
    }
}
