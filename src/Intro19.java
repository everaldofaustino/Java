import java.util.Random;
import java.util.Scanner;

public class Intro19 {

    public static void main(String[] args) {

        // Implemente um jogo em que o computador escolhe um número aleatório entre 1 e 100,
        // e o jogador tenta adivinhar. O jogo continua até que o jogador acerte o número.
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int num = 0;
        int min = 1;
        int max = 100;
        int randomNum = gerador.nextInt((max -min) +1) + min;
        int tentativas = 0;



        while (randomNum!= num){

            System.out.println("Escolha um número entre 1 e 100: ");
            num = scan.nextInt();
            tentativas++;




            if(randomNum>num){

                System.out.println("O número é maior!");

            } else if (randomNum<num) {

                System.out.println("O número é menor.");

            }
            else {

                System.out.println("Você acertou, o número é " + num);
                System.out.print("Número de tentativas realizadas: " + tentativas);
            }

        }


    }
}
