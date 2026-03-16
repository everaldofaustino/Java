import java.util.Scanner;

public class Intro9 {
    public static void main(String[] args) {

        // Crie um programa que leia a altura e largura de uma parede (em metros) e
        // escreva a área da parede e a quantidade de tinta necessária para pintá-la
        // (considerando que cada litro de tinta pinta 2m²).
        //
        //Fórmula para cálculo de área: 
        //area = altura * largura;

        Scanner scan = new Scanner(System.in);

        int litro = 2;

        System.out.print("Digite a altura da parede: ");

        float altura = scan.nextFloat();

        System.out.print("Digite a largura da parede: ");

        float largura = scan.nextFloat();


       int quantidadeTinta = (int) ((altura * largura)/ 2);

        System.out.printf("Quantidade de tinta necessária: %dL  ", quantidadeTinta);
    }
}
