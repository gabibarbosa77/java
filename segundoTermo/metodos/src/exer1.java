import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("ESCOLHA UMA OPERAÇÃO: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        int escolha = sc.nextInt();

        int soma = calcularSoma(num1, num2);
        int subtrair = calcularSubtracao(num1, num2);
        int multiplicar = calcularMultiplicacao(num1, num2);
        double divisao = calcularDivisao(num1, num2);

        if(escolha == 1){
            System.out.println("A soma e: " + soma);
        }else if(escolha == 2){
            System.out.println("A subtracao é: " + subtrair);
        }else if(escolha == 3){
            System.out.println("A multiplicacao e: " + multiplicar);
        }else if(escolha == 4){
            System.out.println("A divisao e: " + divisao);
        }else{
            System.out.println("Opcao invalida!");
        }

        sc.close();
    }

    public static int calcularSoma(int num1, int num2){
        return (num1+num2);
    }

    public static int calcularSubtracao(int num1, int num2){
        return (num1-num2);
    }

    public static int calcularMultiplicacao(int num1, int num2){
        return (num1 * num2);
    }

    public static double calcularDivisao(double num1, double num2){
        if(num1 == 0 || num2 == 0){
            System.out.println("Impossível dividir numeros por 0.");
            return 0;
        }else{
            return (num1/num2);
        }
    }
}
