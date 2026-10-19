import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 1°  lado do triangulo(inteiro): ");
        int num1 = sc.nextInt();

        System.out.println("Entre com 2° lado do triangulo(inteiro): ");
        int num2 = sc.nextInt();

        System.out.println("Entre com 3° vlado do triangulo(inteiro): ");
        int num3 = sc.nextInt();

        boolean triangulo;

        if ((num1 + num3) > num2 && (num1 + num2) > num3 && (num2 + num3) > num1){
            triangulo = true;
        }else{
            triangulo = false;
        }

        if(triangulo == true){
            if(num1 == num2 && num1 == num3){
                System.out.println("Triangulo Equilátero!");
            }else if(num1 == num2 || num1 == num3 || num2 == num3){
                System.out.println("Triangulo Isóceles!");
            }else{
                System.out.println("Triangulo Escaleno!");
            }
        }else{
            System.out.println("Triângulo inválido!");
        }



    }
}
