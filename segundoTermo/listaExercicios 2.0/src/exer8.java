
import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número inteiro e positivo: ");
        int num = sc.nextInt();

        int soma = 0;

        if(num > 0){
            while(num>=1){
                soma += num;
                num--;
            }
            System.out.println("A soma desse numero até 1 é " + soma);
        }else{
            System.out.println("número inválido!");
        }
    }
}
