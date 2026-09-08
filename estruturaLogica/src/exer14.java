import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Entre com o salario atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Entre com o percentual de aumento(ex; 10): ");
        double percentual = scanner.nextDouble();

        double novoSalario = ((percentual / 100.0) * salarioAtual) + salarioAtual;

        System.out.println("---------NOVO SALARIO-------");
        System.out.println("Nome funcionário: " + nomeFuncionario);
        System.out.println("Salario atual: " + salarioAtual);
        System.out.println("Percentual aumento: " + percentual);
        System.out.println("NOVO SALARIO: " + novoSalario);

        scanner.close();
    }

}