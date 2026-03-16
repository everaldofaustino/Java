import java.util.Scanner;

public class Intro21 {

    public static void main(String[] args) {


        // Peça ao usuário para inserir um número e imprima a tabuada desse número de 1 a 10.


        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");

        int numero = scan.nextInt();

        while (numero <1 || numero > 10){

            System.out.print("Número inválido! Digite um número entre 1 e 10: ");
            numero = scan.nextInt();
        }

        for(int i = 1; i<11;i++){

            int tabuada = numero * i;


            System.out.println(numero + "x" + i +"= " + tabuada);


        }



    }
}
