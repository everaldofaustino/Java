import java.util.Scanner;

public class Intro3 {
    public static void main(String[] args) {

        //Crie um programa que leia a distância percorrida por um carro (em km)
        // e o tempo gasto (em horas) e escreva a velocidade média do carro.

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a distância do carro em km: ");

        float dis = scan.nextFloat();

        System.out.print("Digite o tempo gasto em horas: ");
        float tem = scan.nextFloat();

        float dis_metros = dis * 1000;
        float tem_segundos = tem * 3600;

        float vel;

        vel = dis_metros/tem_segundos;

        System.out.printf("A velocidade média do carro é de %.2f m/s ", vel );





    }
}
