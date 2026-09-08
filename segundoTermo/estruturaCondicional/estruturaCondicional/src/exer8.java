import java.util.Scanner;

public class exer8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a medida de um lado do triangulo (somente numero inteiros): ");
        int num1 = scanner.nextInt();

        System.out.println("Entre com a medida de um lado do triangulo (somente numero inteiros): ");
        int num2 = scanner.nextInt();

        System.out.println("Entre com a medida de um lado do triangulo (somente numero inteiros): ");
        int num3 = scanner.nextInt();

        if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > 3) {
            System.out.println("Triangulo valido!");
            if (num1 == num2 && num2 == num3) {
                System.out.println("Triangulo: Equilatero");
            }else if(num1 == num2 || num2 == num3 || num1 == num3){
                System.out.println("Triangulo: Isoceles");
            }else{
                System.out.println("Triangulo: Escaleno");

            }
        }else{
            System.out.println("Valores invalidos, nao e um triangulo");
        }
    }
}