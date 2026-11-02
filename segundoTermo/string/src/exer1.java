import java.util.Scanner;

public class exer1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Quantidade de caracteres é " + nome.length());
        System.out.println("Maiuscula: " + nome.toUpperCase());
        System.out.println("Minuscula: " + nome.toLowerCase());

        sc.close();
    }
}