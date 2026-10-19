import java.util.Scanner;

public class exer6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a base do retangulo: ");
        int base = scanner.nextInt();

        System.out.println("Entre com a altura do retangulo: ");
        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("A area desse retangulo e " + area);

        scanner.close();


    }
}
