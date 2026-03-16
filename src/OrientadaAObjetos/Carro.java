package OrientadaAObjetos;
//Imagine um sistema para controlar as funções de um carro.
//
//A classe **`Carro`** representa um veículo com:
//
//- **Marca:** O fabricante do carro (ex: Fiat, Volkswagen, Chevrolet).
//- **Modelo:** O nome específico do modelo (ex: Argo, Gol, Onix).
//- **Ano:** O ano de fabricação do carro.
//- **Cor:** A cor do carro.
//- **Quilometragem:** A distância total percorrida pelo carro.
//- **Combustível:** O tipo de combustível utilizado pelo carro (gasolina, diesel, etc.).
//
//A classe **`Carro`** oferece métodos para:
//
//- **Ligar:** Aciona o motor do carro.
//- **Desligar:** Desliga o motor do carro.
//- **Acelerar:** Aumenta a velocidade do carro.
//- **Frear:** Diminui a velocidade do carro.
//- **Abastecer:** Adiciona combustível ao tanque do carro.


public class Carro {

    // ============== ATRIBUTOS PRIVADOS ==============
    // Só podem ser acessados dentro desta classe

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double quilometragem;
    private String combustivel;
    private boolean ligado;
    private int velocidade;
    private double tanque;


    // Capacidade máxima do tanque (constante)

    private final int CAPACIDADE_TANQUE=50;

    // ============== CONSTRUTOR ==============

    public Carro(String marca, String modelo, int ano, String cor, String combustivel){
        // Validando os dados antes de atribuir

        if(marca == null || marca.isEmpty()){
            System.out.println("Marca inválida");
            return;
        }

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.combustivel = combustivel;

        // Valores iniciais

        this.quilometragem = 0;
        this.ligado = false;
        this.velocidade = 0;
        this.tanque = 0;

    }

    // ============== GETTERS ==============
    // Métodos públicos para ACESSAR os atributos



    public String getMarca() {
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public String getCor(){
        return cor;
    }

    public double getQuilometragem(){
        return quilometragem;
    }

    public String getCombustivel(){
        return combustivel;
    }

    public boolean isLigado(){
        return ligado;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public double getTanque(){
        return tanque;
    }

    // ============== SETTERS ==============
    // Métodos públicos para MODIFICAR alguns atributos

    public void setCor(String cor){
        if(cor != null && !cor.isEmpty()){
            System.out.println("Mudando cor de "+ this.cor + " para " + cor);
            this.cor = cor;
        }else {
            System.out.println("Cor inválida!");

        }

    }

    // Não permitimos setter para tudo!
    // Por exemplo, não podemos mudar a marca depois de criado
    // (não tem setMarca)

    // ============== MÉTODOS PRINCIPAIS ==============

    public void ligar(boolean ligado){


        if(ligado){

            System.out.println("O carro está ligado");
            return;

        }if (tanque<=0) {
            System.out.println("Não tem combustível, abasteça primeiro.");
            return;
        }


        System.out.println("Carro ligado! " +marca + " " + modelo);



    }

    public void desligar(){

        if(!ligado){
            System.out.println("Ligue o carro primeiro");
            return;
        }
        if(velocidade>0){
            System.out.println("Desacelere para desligar.");
            return;
        }
        ligado = false;
        System.out.println("Carro desligado.");


    }






    public void acelera(int aumento){
        if(!ligado) {
            System.out.println("Ligue o carro primeiro.");
            return;
        }
        if(aumento <= 0){
            System.out.println("A aceleração deve ser positiva.");
            return;
        }
        if(tanque<=0){
            System.out.println("Acabou a gasolina.");
            desligar();
            return;
        }
        // Usando os atributos privados diretamente (dentro da classe pode)
        velocidade = velocidade + aumento;
        tanque = tanque - 0.5;
        quilometragem = quilometragem + (aumento * 0.1);

        System.out.println("Acelerou! Velocidade: " + velocidade + "km/h");
        if(tanque < 5){
            System.out.println("ATENÇÃO: Combustível baixo!");
        }

    }

    public void frear(int reducao){

        if(!ligado){
            System.out.println("Carro desligado, não pode frear.");
            return;
        }
        if(reducao<=0){
            System.out.println("Redução deve ser positiva.");
            return;
        }
        velocidade = velocidade - reducao;

        if(velocidade<0){
            velocidade = 0;
        }




        System.out.println("Freiou! Velocidade: " + velocidade + " km/h");
    }

    public void abastecer(double litros){

        if(litros<=0){
            System.out.println("Quantidade inválida.");
            return;
        }

        double espacoNoTanque = CAPACIDADE_TANQUE - tanque;

        if(litros>espacoNoTanque){
            litros = espacoNoTanque;
            System.out.println("tanqur vai encher! Colocando só " +litros +"litros");
        }

        tanque = tanque + litros;
        System.out.println("Abadtecido! Tanque: "+tanque+ " litros");

        if(tanque>=CAPACIDADE_TANQUE){
            System.out.println("Tanque completamente cheio!");
        }
    }

    /**
     * Mostra as informações do carro
     * Como os atributos são private, precisamos de um método público
     * para ver as informações
     */

    public void mostrarInfo() {
        System.out.println("\n=== INFORMAÇÕES DO CARRO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Combustível: " + tanque + " litros");
        System.out.println("============================\n");
    }

}
