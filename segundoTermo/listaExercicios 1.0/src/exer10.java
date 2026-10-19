import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Entre com sua idade: ");
        int idadeUsuario = scanner.nextInt();

        System.out.println("Olá, " + nomeUsuario + "! " + idadeUsuario + " anos.");

        scanner.close();
    }
}