/*Faça um programa que leia um número inteiro e mostre uma mensagem na tela 
indicando se este número é positivo ou negativo. Pare a execução do programa 
quando o usuário requisitar*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada;

        System.out.println("Digite um número inteiro (ou 'sair' para encerrar): ");

        while (true) {
            System.out.println("Digite um número inteiro (ou 'sair' para encerrar): ");
            
            entrada = scanner.nextLine(); // ler a entrada do user
            
            if (entrada.equalsIgnoreCase("sair")){
                System.out.println("Prograa encerrado");
                break;
            }

            try {
                int numero = Integer.parseInt(entrada); // tenta converter a entrada para um inteiro

                if (numero > 0) {
                    System.out.println("O número " + numero + "é positivo");
                } else if (numero < 0){
                    System.out.println("O número " + numero + "é negativo");
                } else {
                    System.out.println("O número é zero" );
                } 
                
                }catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor,digite um número inteiro ou 'sair' para encerrar o progama");
                }
            
        }
        scanner.close();
    }
}