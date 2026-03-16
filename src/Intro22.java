import java.util.Scanner;

public class Intro22 {

    public static void main(String[] args) {

        //Crie um programa que receba um número inteiro e calcule a soma dos seus dígitos.

        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int numero2 = numero;
        int soma = 0;


        while(numero2!= 0){

        soma += numero2%10;
        numero2 = numero2/10;}

        System.out.println(soma);


        
        



    }
}
