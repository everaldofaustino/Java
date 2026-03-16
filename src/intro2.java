import java.util.Locale;
import java.util.Scanner;

public class intro2 {

    public static void main(String[] args) {

        //Crie um programa que leia o preço de dois produtos e escreva o valor total da compra.
        // Lembre-se que valores são números fracionados, ou seja, declare-os com o tipo double.

        Scanner scan = new Scanner(System.in);

        scan.useLocale(Locale.US);

        System.out.print("Digite o valor do produto 1: ");
        double prod1 = scan.nextDouble();

        System.out.print("Digite o valor do produto 2: ");
        double prod2 = scan.nextDouble();

        double total;

        total = prod1 + prod2;

        System.out.println("total: " + total);

    }
}
