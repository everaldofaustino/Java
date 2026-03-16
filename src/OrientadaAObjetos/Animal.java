package OrientadaAObjetos;

public class Animal {

    //Crie uma classe Animal com os atributos nome, idade e especie.
    // Encapsule os atributos e implemente métodos para emitir um som característico do animal e
    // para imprimir todas as informações do animal.

    private String nome;
    private int idade;
    private String especie;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;


    }

    public String getEspecie(){
        return especie;

    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void emitirSom(){

        System.out.println("Som do animal.");
    }

    @Override
    public String toString(){
        return "Animal  \nNome: " + nome +
                "\nIdade: " + idade +
                "\nEspecie: " + especie;

    }

}
