package OrientadaAObjetos;

public class ContaBancaria {


    //Crie uma classe ContaBancaria com os atributos numero, saldo e titular.
    // Encapsule os atributos para garantir que apenas métodos da classe possam modificá-los.

    private int numero;
    private double saldo;
    private String titular;

    public int getNumero(){

        return numero;
            }

    public void setNumero(int numero){
        this.numero = numero;

    }

    public double getSaldo(){

        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular){

        this.titular = titular;
    }
}
