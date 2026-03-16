package OrientadaAObjetos;

public class SerVivoTeste {

    public static void main(String[] args) {

        SerVivo serVivo1 = new SerVivo();

        serVivo1.setNome("Animal");
        serVivo1.setIdade(7);

        System.out.println(serVivo1.getNome());
        System.out.println(serVivo1.getIdade());

    }
}
