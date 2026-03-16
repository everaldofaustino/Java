package OrientadaAObjetos;

import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite o gênero: ");

        char genero = scan.next().charAt(0);

        Pessoa p = new Pessoa();

        p.setNome(nome);
        p.setIdade(idade);
        p.setGenero(genero);

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Gênero: " +Character.toUpperCase(p.getGenero()));

    }
}
