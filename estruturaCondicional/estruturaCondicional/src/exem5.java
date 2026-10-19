import java.util.Scanner;

public class exem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Entre com o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Cliente cadastrado (S/N): ");
        char cadastrado = scanner.next().charAt(0);

        double percentualDesconto;

        if (valorCompra <= 100) {
            percentualDesconto = 0;
        } else if (valorCompra >= 101 && valorCompra<= 500){
            percentualDesconto = 10;
        } else{
            percentualDesconto = 15;
        }

        if (cadastrado == 'S' || cadastrado == 's'){
            percentualDesconto += 5;
        }

        double desconto = (percentualDesconto / 100) * valorCompra;
        double valorFinal = valorCompra - desconto;

        System.out.println("=======RESUMO DA COMPRA=======");
        System.out.println("Nome: " + nome);
        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Cliente cadastrado possui um aumento de 5% no percentual de desconto.");
        System.out.println("Percentual de desconto: " + percentualDesconto);
        System.out.println("Desconto: " + desconto);
        System.out.println("VALOR FINAL: " + valorFinal);

        scanner.close();
    }
}

