package OrientadaAObjetos;

public class Pessoa {

    //Crie uma classe Pessoa com os atributos nome, idade e genero. Encapsule os atributos e implemente métodos para definir e obter os valores de forma segura.

    private String nome;
    private int idade;
    private char genero;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;

    }

    public void setIdade(int idade){
        this.idade = idade;


    }

    public char getGenero(){

        return genero ;
    }

    public void setGenero(char genero){

        this.genero = genero;
    }


}
