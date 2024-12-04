//Faça um programa para calcular o estoque médio de uma peça, sendo que: 
//ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.

import java.util.Scanner;

//criar classe EstoqueMedio
public class Exercicio1 {

    public static void main(String[] args) {
        //criar objeto scanner par leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        //solicitar quantidade minima 
        System.out.println("Digite a quantidade mínimo: ");
        double estoqueMinimo = scanner.nextDouble();

        //solicitar quantidade maxima
        System.out.println("Digite a quantidade máximo: ");
        double estoqueMaximo = scanner.nextDouble();

        //calcular estoque médio
        double estoqueMedio = (estoqueMinimo + estoqueMaximo) /2;

        //exibir o resultado ao usuário
        System.out.println("O estoque médio é:  " + estoqueMedio);

        scanner.close();
    }
}