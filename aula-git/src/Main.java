import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nInforme seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Sua idade: ");
        int idade = Integer.parseInt(teclado.nextLine());

        if(idade >= 18) {
            System.out.println("\nAcesso permitido, " + nome + "!");
            System.out.println("Você é maior de idade há " + (idade-18) + " ano(s)!");
        }
        else {
            System.out.println("\nAcesso negado, " + nome + "!");
            System.out.println("Você é menor de idade, volte em " + (18-idade) + " ano(s)!");
        }
    }
}