import java.util.Scanner;

public class Intro6 {

    public static void main(String[] args) {

        // Crie um programa que leia a quantidade de litros de água consumidos por uma residência em um mês
        // e escreva o valor da conta de água (considerando que cada litro de água custa R$0,02).

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de litros consumidos: ");
        float litrosConsumidos = scan.nextFloat();

       Double valorConta;

        valorConta = litrosConsumidos * 0.02;

        System.out.printf("Valor da conta: R$ %.2f", valorConta);




    }
}
