import java.util.Scanner;

public class Cumprimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Bom dia, como voce esta " + nome + "?");
        scanner.close();
    }
}