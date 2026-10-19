import java.util.Scanner;

public class exer4 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] valores = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8};

        System.out.println("Entre com um valor a ser encontrado (inteiro):" );
        int num = sc.nextInt();

        boolean encontrado = false;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] == num){
                System.out.println("=============Valor encontrado============");
                System.out.println("Valor a ser procurado: " + num);
                System.out.println("Posição " + i);

                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Valor não encontrado!!");
        }
     sc.close();
    }
}