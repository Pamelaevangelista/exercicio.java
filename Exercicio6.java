/*Escreva um programa que leia quatro notas escolares de um aluno e apresentar 
uma mensagem que o aluno foi aprovado se o valor da média escolar for maior 
ou igual a 7. Se o valor da média for menor que 7, solicitar a nota do recuperação, 
somar com o valor da média e obter a nova média. Se a nova média for maior ou 
igual a 7, apresentar uma mensagem informando que o aluno foi aprovado na 
recuperação. Se o aluno não foi aprovado, apresentar uma mensagem informando 
esta condição. Apresentar junto com as mensagens o valor da média do aluno.*/

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) /4;

        //Verificação da aprovação do aluno

        if(media >= 7) {
            System.out.printf("A média do aluno é %.2f. O aluno foi aprovado \n",media);
        } else {
            System.out.printf("A média do aluno é %.2f. O aluno não foi aprovado \n",media);

            System.out.println("Digite a nota de recuperação: ");
            double notaRecuperacao = scanner.nextDouble();

            double novaMedia = (media = notaRecuperacao) /2;

            //verificação da nova média
            if (novaMedia>= 7){
                System.out.printf("A média do aluno é %.2f. O aluno foi aprovado \n", novaMedia);
            }else{
                System.out.printf("A média do aluno é %.2f. O aluno não foi aprovado \n", novaMedia);
            }

            scanner.close();
        }


    }
}