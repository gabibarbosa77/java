import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Entre com um numero inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("====== OPCOES =======");
        System.out.println("A -> Adicao");
        System.out.println("S -> Subtracao");
        System.out.println("M -> Multiplicacao");
        System.out.println("D -> Divisao");
        System.out.println("Entre com uma das opcoes: ");
        char operacao = scanner.next().charAt(0);

        double calculo = 0;

        if (operacao == 'A' || operacao == 'a'){
            calculo = num1 + num2;

            System.out.println("========== RESULTADO ==========");
            System.out.println("Numero 1: " + num1);
            System.out.println("Numero 2: " + num2);
            System.out.println("Operacao: " + operacao);
            System.out.println("RESULTADO: " + calculo);

        }else if (operacao == 'S' || operacao == 's'){
            calculo = num1 - num2;
            System.out.println("========== RESULTADO ==========");
            System.out.println("Numero 1: " + num1);
            System.out.println("Numero 2: " + num2);
            System.out.println("Operacao: " + operacao);
            System.out.println("RESULTADO: " + calculo);
        } else if(operacao == 'D' || operacao == 'd'){
            if (num2 == 0){
                System.out.println("========== RESULTADO ==========");
                System.out.println("Numero 1: " + num1);
                System.out.println("Numero 2: " + num2);
                System.out.println("Operacao: " + operacao);
                System.out.println("Impossível realizar a divisao, um dos numero é zero!");
            } else{
                calculo = num1 / num2;

                System.out.println("========== RESULTADO ==========");
                System.out.println("Numero 1: " + num1);
                System.out.println("Numero 2: " + num2);
                System.out.println("Operacao: " + operacao);
                System.out.println("RESULTADO: " + calculo);
            }
        } else if (operacao == 'M' || operacao == 'm' ) {
            calculo = num1 * num2;

            System.out.println("========== RESULTADO ==========");
            System.out.println("Numero 1: " + num1);
            System.out.println("Numero 2: " + num2);
            System.out.println("Operacao: " + operacao);
            System.out.println("RESULTADO: " + calculo);
        } else {
            System.out.println("Operacao escolhida e invalida!");
        }
            scanner.close();
    }   
}