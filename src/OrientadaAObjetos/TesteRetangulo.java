package OrientadaAObjetos;

import java.util.Scanner;

public class TesteRetangulo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.print("Digite a altura do retângulo: ");
        r.altura = scan.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        r.largura = scan.nextDouble();

        double area = r.CalcularArea();
        double perimatro = r.CalcularPerimetro();

        System.out.printf("Valor da área: %.2f m²\n",area );
        System.out.printf("Valor do perímetro: %.2f m", perimatro);




    }
}
