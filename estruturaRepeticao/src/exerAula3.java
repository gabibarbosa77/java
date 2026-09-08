import java.util.Scanner;

public class exerAula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Entre com um número: ");
        int tabuada = scanner.nextInt();

        int contador = 0;

        while(contador <= 10){
            int conta = tabuada * contador;
            System.out.println(tabuada + " x " + contador + " = " + conta);
            contador++;
        }

        scanner.close();
    }
}
