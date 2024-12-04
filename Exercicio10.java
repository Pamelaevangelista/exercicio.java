/*Escreva um programa que leia dois números inteiros e apresente as opções para 
usuário escolher o que deseja realizar: 
1 – Verificar se um dos números lidos é ou não múltiplo do outro 
2 – Verificar se os dois números lidos são pares 
3 – Verificar se a média dos dois números é maior ou igual a 7. 
4 – Sair*/

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int numero2 = scanner.nextInt();

        int opcao;

        do {
            System.out.println("\n Escolha uma opção: ");
            System.out.println("1 - Verificar se um dos número lidos é ou não múltiplo do outro ");
            System.out.println("2 - Verificar se um dos números lidos são pares ");
            System.out.println("3 - Verificar se a média dos dois números é maior ou igaul a 7 ");
            System.out.println("4 - Sair ");
            System.out.println("Opção escolhida ");
            opcao = scanner.nextInt();

            switch (opcao){
                 case 1: 
                    verificarMultiplo(numero1, numero2);
                    break;

                case 2: 
                    verificarPares(numero1, numero2);
                    break;

                case 3: 
                    verificarMedia(numero1, numero2);
                    break;

                case 4:
                    System.out.println("Finalizando o programa");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente");
            }

        } while (opcao !=4);
            scanner.close();
    }
    //Metod para verificar se é multiplo ou não
    private static void verificarMultiplo( int numero1, int numero2){
        if ( numero1 % numero2 == 0){
            System.out.println(numero1 + " é múltiplo de " + numero2);
        } else if (numero2 % numero1 == 0){
            System.out.println(numero2 + " é múltiplo de " + numero1);
        } else {
            System.out.println("Nenhum dos números é múltiplo do outro");
        }
    }

    //Metodo para verificar se são pares
    private static void verificarPares ( int numero1, int numero2){
        if( numero1 % 2 ==0 && numero2 % 2==0){
            System.out.println("Ambos os números são pares");
        } else {
            System.out.println("Nenhum dos números é par do outro");
        }
    }

    //Metodo para verificar se a média é maior ou igual a 7
    private static void verificarMedia(int numero1, int numero2){
        double media = (numero1 + numero2)/2;

        if(media >= 7){
            System.out.println("A média dos dois números é: " +media+ ", que é maior ou igual a 7.");
        } else {
            System.out.println("A média dos dois números é: " +media+ ", que é menor que 7.");
        }
    }
}