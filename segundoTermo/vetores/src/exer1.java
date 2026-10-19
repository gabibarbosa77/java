import java.util.Scanner;

public class exer1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for(int contador = 0; contador<num.length; contador++){
            System.out.println("Entre com um numero inteiro (" + (contador+1) + "):");
            num[contador] = sc.nextInt();
        }

        for(int i = 0; i < num.length;i++){
            System.out.println("Elemento " + i + ": " + num[i]);
        }

        sc.close();
    }
}