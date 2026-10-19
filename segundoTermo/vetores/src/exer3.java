import java.util.Scanner;

public class exer3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++){
            System.out.println("Entre com numero inteiro (" + (i+1) + "): ");
            num[i] = sc.nextInt();
        }

        int maior = num[0];
        int menor = num[0];

        for(int contador = 0; contador< num.length; contador++){
            if(num[contador]>maior){
                maior = num[contador];
            }

            if(num[contador] < menor){
                menor = num[contador];
            }
        }

        System.out.println("Maior valor inserido: " + maior);
        System.out.println("Menor valor inserido: " + menor);

        sc.close();
    }
}
