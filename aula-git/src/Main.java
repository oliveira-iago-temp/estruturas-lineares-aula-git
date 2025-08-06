import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nInforme seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Bem-vindo " + nome + "!");
    }
}