import java.util.Scanner;

public class exem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.println("Entre com uma a terceira: ");
        double n3 = sc.nextDouble();

        double media = calcularMedia(n1, n2, n3);  

        System.out.println("A média é: " + media);

        exibirResultado(media);

        sc.close();
    }


    public static double calcularMedia(double n1, double n2, double n3){
        return (n1+n2+n3) /3;
    }

    public static void exibirResultado(double media){
        if(media >= 6.0){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }        
}