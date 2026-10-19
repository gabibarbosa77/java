import java.util.Scanner;

public class exer5{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int contadorImpar = 0;
        int contadorPar = 0;

        for(int i = 0; i < num.length;i++){
            System.out.println("Entre com numero inteiro " + (i+1) + " :");
            num[i] = sc.nextInt();

            if((num[i]%2) == 0){
                contadorPar += 1;
            }else{
                contadorImpar += 1;
            }
        }
        
        System.out.println("Quantidade de numeros pares: " + contadorPar);
        System.out.println("Quantidade de numeros impares: " + contadorImpar);

        sc.close();
    }
}