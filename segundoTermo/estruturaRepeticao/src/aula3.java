
import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scanner.nextInt();

        int contador = 0;

        while (contador<=10) {
            int tabuada = num * contador;
            System.out.println(num + " x " + contador + " = " + tabuada);
            contador++;
        }
        scanner.close();
    }
}
