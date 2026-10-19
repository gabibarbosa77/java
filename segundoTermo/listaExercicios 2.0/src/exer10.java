import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int par =0;
        int impar =0;

        for(int i = 0; i <num.length; i++){
            System.out.println("Entre com " + (i+1) + " numero: ");
            num[i] = sc.nextInt();
        }

        for(int contador = 0; contador < num.length; contador++){
            if((num[contador]%2) == 0){
                par += 1;
            }else{
                impar += 1;
            }
        }

        System.out.println("Números pares: " + par);
        System.out.println("Números impares: " + impar);
    }
}
