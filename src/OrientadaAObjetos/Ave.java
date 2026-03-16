package OrientadaAObjetos;

public class Ave extends SerVivo {

    //Crie uma classe Ave que herda da classe Animal . Adicione um atributo tipoDeBico e um método para voar.

    private String tipoDeBico;

    public String getTipoDeBico(){
        return tipoDeBico;

    }

    public void setTipoDeBico(String tipoDeBico) {
        this.tipoDeBico = tipoDeBico;
    }

    public void voar(){

        System.out.println("O " + this.getNome() + " está voando.");
    }
}
