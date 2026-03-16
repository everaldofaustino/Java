package OrientadaAObjetos;

public class AnimalDeEstimacao {

    private String nome;
    private int idade;
    private String especie;
    private String raca;
    private String porte;
    private Character sexo;
    private boolean comFome;
    private boolean felicidade;
    private int nivelEnergia;
    private int nivelSaude;


    AnimalDeEstimacao(String nome,int idade,String especie,String raca, String porte,char sexo){

        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome inválido!");
            return;

        }

        if( idade < 0){
            System.out.println("Valor inválido.");
            return;

        }

        if(especie == null || especie.trim().isEmpty()){
            System.out.println("Espécie inválida.");
            return;
        }

        if(raca == null || raca.trim().isEmpty()){
            System.out.println("Raça inválida.");
            return;
        }

        if(porte == null || porte.trim().isEmpty()){
            System.out.println("Espécie inválida.");
            return;
        }

        sexo = Character.toUpperCase(sexo);

        if(sexo != 'M' && sexo != 'F'){
            System.out.println("Sexo inválido.");
            return;
        }

        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.sexo = sexo;
        this.comFome = true;
        this.felicidade = true;
        this.nivelEnergia = 100;
        this.nivelSaude = 100;


    }

    public String getNome(){
       return nome;
    }


    public int getIdade(){
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public String getPorte() {
        return porte;
    }

    public Character getSexo() {
        return sexo;
    }

public void alimentar(){

        if(comFome){
            System.out.println(nome  + " foi alimentado.");
            comFome = false;
            nivelEnergia = Math.min(100, nivelEnergia +20);
        }

      else{
            System.out.println(nome + " não está com fome.");

        }



}

public void brincar(){

        if(nivelEnergia>=20){

            System.out.println("Brincando com " + nome);
        nivelEnergia = nivelEnergia - 20;
        felicidade = true;
        comFome = true;
        } else {
            System.out.println(nome + " está muito cansado para brincar.");
        }
}


public void levarAoVeterinario(){
    System.out.println("Levando " + nome + " ao veterinário.");
    nivelSaude = 100;
    System.out.println("Saúde de " + nome + " foi restaurada.");
}

public void passear(){
        if(nivelEnergia>=30){
    System.out.println("Passeando com o " + nome);

        nivelEnergia -= 30;
        felicidade = true;
        comFome = true;}else{
            System.out.println(nome + " está muito cansado.");

        }

}

public void darBanho(){

    System.out.println("Dando banho " + nome);
    nivelEnergia = Math.min(100, nivelSaude + 10);
    System.out.println(nome + " está limpo!");
}



public void treinar(){

        if(nivelEnergia>= 15) {
            System.out.println("Treinando o " + nome);
            nivelEnergia-=15;
            System.out.println(nome + " está treinado");
        }

        else{
            System.out.println(nome + " está cansado.");
        }
}

public void verificarFelicidade(){

        if(!felicidade || nivelEnergia <30){
            System.out.println(nome + " está precisando de atenção.");

        }

        else if(comFome){
            System.out.println("Está com fome");

        }
        else{
            System.out.println("Está saudável e feliz.");
        }



}

}
