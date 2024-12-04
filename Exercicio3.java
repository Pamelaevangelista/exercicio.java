/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário 
deve fornecer o tempo gasto na viagem e a velocidade média. Desta forma, será 
possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * 
VELOCIDADE. 
Tendo o valor da distância, basta calcular a quantidade de litros de combustível 
utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12. 
O programa deve apresentar os valores da velocidade média, tempo gasto, a 
distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe 
com valores reais*/


//função scanner para solicitar informações ao usuário
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //solicitar tempo gasta em horas 
        System.out.print("Tempo gasto na viagem (em horas): ");
        double tempoGasto = scanner.nextDouble();

        //solicitar velocidade média 
        System.out.print("Velocidade média ( em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        //calcular distancia percorrida
        double distancia = tempoGasto * velocidadeMedia;

        //calcular quantidade de litros utilizados
        double litrosUsados = distancia /12;
        
        //Exibir resultados
        System.out.printf("velocidade média: %.2f %n", velocidadeMedia);
        System.out.printf("Tempo gasto: %.2f %n", tempoGasto);
        System.out.printf("Distancia percorrida: %.2f %n", distancia);
        System.out.printf("Quantidade de litros utilizadas: %.2f %n", litrosUsados);

        scanner.close();
    }
}