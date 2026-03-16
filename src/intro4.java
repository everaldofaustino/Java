import java.util.Scanner;

public class intro4 {

    public static void main(String[] args) {

        // Crie um programa que leia o número de horas trabalhadas por um
        // funcionário e o valor da hora de trabalho e escreva o salário bruto desse funcionário.

        Scanner scan = new Scanner(System.in);

        float valordaHora = 50;

        System.out.print("Digite as horas de trabalho: ");

        int horastrabalhadas = scan.nextInt();

        float salarioBruto = horastrabalhadas * valordaHora;

        System.out.printf("Valor do salário bruto: R$ %.2f", salarioBruto);


    }
}
