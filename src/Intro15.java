import java.sql.SQLOutput;
import java.util.Scanner;

public class Intro15 {

    public static void main(String[] args) {

//Implemente um sistema de semáforo usando switch case. Receba um estado (vermelho, amarelo ou verde) e determine a ação apropriada

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite entre os estados Vermelho, Amarelo e Verde: ");
        String estado = scan.nextLine().toLowerCase();

        switch (estado){

            case "vermelho":
                System.out.println("Pare.");
                break;

            case "verde":
                System.out.println("Siga.");
                break;

            case "amarelo":
                System.out.println("Atenção.");

                break;




        }

    }
}
