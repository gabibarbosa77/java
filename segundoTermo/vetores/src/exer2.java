public class exer2 {
    public static void main(String[] args) {
        double[] valores = {1.5 , 2.5 , 3.5 , 4.5 , 5.5 , 6.5};
        double soma = 0;

        for (int i = 0; i < valores.length; i++){
            soma += valores[i];
        }

        double media = soma/ valores.length;

        for(int contador = 0; contador < valores.length; contador++){
            System.out.println("Elemento " + contador + ": " + valores[contador]);
        }

        System.out.println("A soma de todos os vetores é " + soma);
        System.out.println("A média aritmetica é " + media);

    }
}
