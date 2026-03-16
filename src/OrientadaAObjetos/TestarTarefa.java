package OrientadaAObjetos;

public class TestarTarefa {

    public static void main(String[] args) {

        Tarefa T1 = new Tarefa("Estudar");

        T1.getEstado();

        System.out.println(T1.getEstado());

        T1.marcarConcluida();

        System.out.println(T1.getEstado());

        System.out.println(T1);

    }
}
