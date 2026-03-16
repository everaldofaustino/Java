package OrientadaAObjetos;

public class TesteMamifero {

    public static void main(String[] args) {

        Mamifero mae = new Mamifero();
        Mamifero filhote = new Mamifero();
        mae.setNome("Porca");
        mae.setGenero('F');

        filhote.setNome("Porquinho");
        filhote.setIdade(2);
        filhote.setGenero('M');

        mae.amamentar(filhote);






    }
}
