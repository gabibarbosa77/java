Exercício 5 —Inverter uma palavra Desafio: 

explique por que o índice começa em length() - 1 e diminui até zero. 

String palavra = sc.nextLine(); 

for (int i = palavra.length() - 1; i >= 0; i--) { 
    System.out.print(palavra.charAt(i)); 
} 

System.out.println();

respostas: O índice começa em length() - 1 porque os índices de uma String começam em zero, 
e o último caractere está sempre uma posição antes do valor retornado por length(). O índice diminui 
até zero para percorrer a palavra de trás para frente, exibindo os caracteres na ordem inversa.