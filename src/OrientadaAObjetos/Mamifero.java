package OrientadaAObjetos;

public class Mamifero extends SerVivo{

    // Crie uma classe Mamifero que herda da classe Animal . Adicione um atributo genero e um método para amamentar.

    private Character genero;

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }
    public void amamentar(Mamifero filhote){

        System.out.println("A Mamãe " + this.getNome() + " está amamentando o " + filhote.getNome() );


    }
}
