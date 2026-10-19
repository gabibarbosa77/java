import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[6];

        // Preenchendo o vetor
        for(int i = 0; i < num.length; i++){
            System.out.println("Entre com o " + (i + 1) + " numero: ");
            num[i] = sc.nextInt();
        }

        // Invertendo o vetor
        for(int i = 0; i < num.length / 2; i++){
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }

        // Exibindo o vetor invertido
        System.out.println("Vetor invertido:");

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}