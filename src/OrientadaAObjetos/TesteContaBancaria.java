package OrientadaAObjetos;

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria cb = new ContaBancaria();

        cb.setNumero(2000);
        cb.setSaldo(4567);
        cb.setTitular("João");

        System.out.println("Número da conta: " + cb.getNumero());
        System.out.printf("Saldo da conta: R$%.2f \n", cb.getSaldo() );
        System.out.println("Nome do titular: " + cb.getTitular());


    }
}
