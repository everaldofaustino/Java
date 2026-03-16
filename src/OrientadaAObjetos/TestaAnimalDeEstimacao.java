package OrientadaAObjetos;

public class TestaAnimalDeEstimacao {
    public static void main(String[] args) {
        AnimalDeEstimacao meuPet = new AnimalDeEstimacao("Rex",3,"Cachorro","Labrador","Grande",'M');



        meuPet.verificarFelicidade();
        meuPet.alimentar();
        meuPet.verificarFelicidade();
        meuPet.brincar();
        meuPet.verificarFelicidade();
        meuPet.alimentar();
        meuPet.levarAoVeterinario();
        meuPet.darBanho();
        meuPet.verificarFelicidade();
    }
}
