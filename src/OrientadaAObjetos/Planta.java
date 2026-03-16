package OrientadaAObjetos;

public class Planta extends SerVivo{

    private String Tipo;


    public String getTipo(){

        return Tipo;
    }

    public void setTipo(String Tipo){

        this.Tipo = Tipo;
    }

    public void fotossintese(){

        System.out.println("A planta tipo "+ getTipo() + " faz fotossíntese");
    }
}
