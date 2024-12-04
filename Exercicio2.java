/*2) Faça um programa para pagamento de comissão de vendedores de peças,levando-se em consideração que sua comissão será de 5% do 
total da venda e que você tem os seguintes dados: 
- Identificação do vendedor 
- Código da peça 
- Preço unitário da peça 
- Quantidade vendida*/

import java.util.Scanner;
//criar classe
public class Exercicio2 {

    public static void main(String[] args) {
        // criar objeto
        Scanner scanner = new Scanner(System.in);
    
        //solicitar identicação do vendedor ao usuario
        System.out.print("Identificação do vendedor: ");
        String identificacaoVendedor = scanner.nextLine();

        ////solicitar codigoda peça ao usuario
        System.out.print("Código da peça: ");
        int codigoPeca = scanner.nextInt();

        //solicitar Preço unitário ao usuario
        System.out.print("Preço unitário da peça: R$ ");
        double precoPeca = scanner.nextDouble();

        //solicitar quantidade vendida ao usuario
        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        //criar total de vendas 
        double totalVendas = (quantidadeVendida * precoPeca);

        // criar comissão(porcentagem é o valor sobre 100)
        double comissao = (totalVendas * 5/100);

        //mostrar ao vendedor todas as variáveis
        System.out.println("Identificação do(a) vendedor(a): " + identificacaoVendedor);

        System.out.println("Código da peça: " + codigoPeca);

        System.out.println("Total da venda: R$ " + totalVendas);

        System.out.printf("Comissão do vendedor: R$  %.2f" , comissao);

        
        scanner.close();
    
}

}