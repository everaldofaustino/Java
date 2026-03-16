package OrientadaAObjetos;

public class TesteAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.setNome("Bob");
        animal1.setIdade(18);
        animal1.setEspecie("Cachorro");

        String informacoes = animal1.toString();
        System.out.println(informacoes);
        animal1.emitirSom();


    }
}
