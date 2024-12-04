/*Faça um programa que leia um número. Se positivo armazene-o em A, se for 
negativo, em B. No final mostrar o resultado.*/

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double A = 0;
        double B = 0;

        while(true) {
            System.out.println("Digite um número (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine();

            if(entrada.equalsIgnoreCase("sair")){
                break; // sai do loop se digitar sair 
            }

            try {
                double numero = Double.parseDouble(entrada); // converte strng em double

                if (numero > 0){
                    A = numero; // armazena em A se for positivo
                    System.out.printf("Número positivo armazenado em A: %.2f \n", A);
                } else if (numero < 0){
                    B = numero; // armazena em A se for positivo
                    System.out.printf("Número negativo armazenado em A: %.2f \n", B);
                } else {
                    System.out.println("O número é zero e não será armazenado");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor,digite um número ou 'sair' para encerrar");
            }
            // solicita novamente um novo número para o usuário
            System.out.println("Digite outro número (ou 'sair' para encerrar): ");
        }

        System.out.printf("Número positivo final armazenado em A: %.2f \n", A);
        System.out.printf("Número negativo final armazenado em A: %.2f \n", B);

        scanner.close();

    }
}