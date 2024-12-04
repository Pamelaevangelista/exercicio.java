/*Escreva um programa que exiba as seguintes opções e realize os que se pede 
em cada uma delas: 
1 – Adição 
2 – Subtração 
3 – Multiplicação 
4 – Divisão
A partir da opção escolhida, o programa deverá solicitar para que o usuário digite 
dois números. Em seguida, o programa deve exibir o resultado da opção indicada 
pelo usuário e perguntar ao usuário se ele deseja voltar ao menu principal. Caso 
a resposta seja ´S´ ou ´s´, deverá voltar ao menu, caso contrário deverá encerrar 
o programa.*/

//calculadora simples

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        
        while (continuar) {
            //exibe o menu

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            
            System.out.println("Digite a sua opção: ");
            int opcao = scanner.nextInt();

            //solicita numeros ao usuário
            System.out.println("Digite o primeiro numero: ");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double numero2 = scanner.nextDouble();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado da adição: " +resultado);
                    break;

                case 2:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado da subtração: " +resultado);
                    break;

                case 3:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado da multiplicação: " +resultado);
                    break;

                case 4:
                    if(numero1 != 0) {
                        resultado = numero1 /numero2;
                        System.out.println("Resultado da divisão: " +resultado);
                    } else {
                        System.out.println("Erro: Não é possivel fazer divisão por zero");
                    }
                    break;

                    default:
                        System.out.println("opção inválida. Tente novamente");
                        continue;
            }
            //pergunta se o usuário deseja voltar ao menu
            System.out.println("Deseja voltar ao meu principal? (S/N): ");
            scanner.nextLine();//limpa o buffer do scanner
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false; // Encerra o loop se a resposta não for 'S' ou 's'
            }
        }

        // Encerra o programa
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}