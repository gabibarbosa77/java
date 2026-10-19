import java.util.Scanner;

public class exer1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Preco: ");
        Double preco = sc.nextDouble();

        System.out.println("Entre com a quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.println("Entre com o percentual de desconto (10):");
        int percentual = sc.nextInt();

        System.out.println("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();

        Double bruto    = preco * quantidade;
        Double desconto = (percentual / 100.0) * bruto;
        Double total = bruto - desconto;
        Double valorParcela = total / parcelas;
        
        if(parcelas > 6){
            Double acrescimo = 0.03 * total;
            Double valorFinal =  acrescimo + total;
            Double valorParcelas = valorFinal / parcelas;

            System.out.println("Valor Bruto: " + bruto);
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor com Desconto: " + total);
            System.out.println("Total parcelas(a cima de 6 parcelas a 3% de acrescimo): " + parcelas);
            System.out.println("Acrescimo: " + acrescimo);
            System.out.println("Valor Final é R$" + valorFinal + " por " + parcelas + " parcelas sera R$" + valorParcelas);
        }else{
            System.out.println("Valor Bruto: " + bruto);
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor com Desconto: " + total);
            System.out.println("Total parcelas: " + parcelas);
            System.out.println("Valor Final é R$" + total + " por " + parcelas + " parcelas sera R$" + valorParcela);
        }
        
    }
}