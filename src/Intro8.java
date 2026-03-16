import java.util.Scanner;

public class Intro8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Crie um programa que leia a cotação do dólar e um valor em reais e escreva o valor convertido em dólares.

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scan.nextDouble();

        System.out.print("Digite o valor em reais a ser cotado: ");
        double valorReais = scan.nextDouble();

        double valorCotado = cotacao * valorReais;

        System.out.printf("O valor cotado em dólares: $ %.2f", valorCotado);

    }
}
