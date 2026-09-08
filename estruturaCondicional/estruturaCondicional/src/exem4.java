import java.util.Scanner;

public class exem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Entre com a segunda nota:");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 6){
            System.out.println("Aprovado!");
        } else if (media >= 4){
            System.out.println("Exame!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
