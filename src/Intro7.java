import java.util.Scanner;

public class Intro7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Crie um programa que leia o peso de uma encomenda (em kg) e escreva
        // o valor do frete (considerando que cada kg custa R$5,00).

        double valorPeso = 5;
        System.out.print("Digite o peso da encomenda: ");

        double peso = scan.nextDouble();

        double valorFrete = peso * valorPeso;

        System.out.printf("Valor do frete R$ %.2f", valorFrete);






    }
}
