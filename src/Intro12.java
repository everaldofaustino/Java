import java.util.Scanner;

public class Intro12 {

    public static void main(String[] args) {

        // Escreva um programa que leia dois números inteiros do usuário
        // e diga qual é o maior, o menor ou se são iguais.

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        if(num1>num2){

            System.out.printf("O número %d é o maior",num1);
        } else if (num1==num2) {
            System.out.println("Números iguais!");

        }
        else
        {

            System.out.printf("O número %d é o maior", num2);
        }

    }
}
