import java.util.Scanner;

public class exer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int resto = segundos % 3600;
        int minutos = resto / 60;
        int segundosRestantes = resto % 60;

        System.out.println("Convertendo para horas: " + horas + "hrs " + minutos + " min " + segundosRestantes + "s");

        scanner.close();
    }
}