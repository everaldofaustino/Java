import java.util.Scanner;

public class Intro13 {

    public static void main(String[] args) {

        // Escreva um programa que leia o mês do ano em número (1 a 12)
        // e diga quantos dias ele tem. Considere que o ano não é bissexto.

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um mês: ");

        int mes = scan.nextInt();

        if((mes == 1) || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes== 10 || mes == 12){

            System.out.print("O mês " + mes + " possui 31 dias.");

        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            System.out.print("O mês " + mes + "possui 30 dias.");

        }

        else{
            System.out.print("O mês " + mes + "possui 28 dias.");

        }

    }
}
