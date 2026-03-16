import java.util.Scanner;

public class Intro10 {
    public static void main(String[] args) {


        //Crie um programa que leia o preço à vista de um produto e o número de parcelas e escreva
        // o valor de cada parcela (considerando juros simples de 2% ao mês).
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite preço: ");
        float precoProduto = scan.nextFloat();

        System.out.print("Digite a quantidade de parcelas: ");
        int parcela = scan.nextInt();

        double precoParcelado = (precoProduto * parcela * 0.02) + precoProduto;
        double valorParcela = precoParcelado/parcela;


        System.out.printf("Valor do produto à vista: R$ %,.2f\n", precoProduto);
        System.out.printf("Valor do produto a prazo: R$ %,.2f \n", precoParcelado);
        System.out.printf("Valor da parcela: R$ %,.2f", valorParcela);


    }
}
