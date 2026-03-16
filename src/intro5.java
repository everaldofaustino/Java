import java.util.Scanner;

public class intro5 {
    public static void main(String[] args) {
        //Crie um programa que leia o valor de um empréstimo, a taxa de juros mensal
        // e o número de meses e escreva o valor da parcela mensal do empréstimo.

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do empréstimo: ");
        float valorEmprestimo = scan.nextFloat();

        System.out.print("Digite a taxa de juros mensal: ");
        float taxa = scan.nextFloat();

        System.out.print("Número de meses: ");
        int tempo = scan.nextInt();

        float montante;

        float juros;
        juros = valorEmprestimo * (taxa/100) * tempo;

        montante = valorEmprestimo + juros;

        float parcela;
        parcela = montante/tempo;

        System.out.printf("Valor da parcela mensal: R$ %.2f", parcela);




    }
}
