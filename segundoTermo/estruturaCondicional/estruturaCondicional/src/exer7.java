import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um ano inteiro: ");
        int ano = scanner.nextInt();

        double quatro = ano % 4;
        double cem = ano % 100;
        double quatrocentos = ano % 400;

        if(quatro == 0){
            System.out.println(ano + " e bissexto!");
        } else if (cem == 0 ){
            if(quatrocentos == 0){
                System.out.println(ano + " e bissexto!");
            }else{
                System.out.println(ano + "nao e bissexto!");
            }
        }

        scanner.close();

    }
}