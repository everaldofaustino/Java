package OrientadaAObjetos;

public class TestaCarro  {

    public static void main(String[] args) {


        Carro meucarro = new Carro("Fiat", "Uno", 2020,"Vermelho","Gasolina" );

        // MOSTRANDO COMO ACESSAR OS ATRIBUTOS AGORA

        // ❌ ISSO NÃO FUNCIONA MAIS (atributos private)
        // meuCarro.marca = "Chevrolet";  // ERRO!
        // System.out.println(meuCarro.marca);  // ERRO!

        // ✅ ISSO FUNCIONA (usando getters)

        System.out.println("Marca: "+meucarro.getMarca());
        System.out.println("Modelo: "+meucarro.getModelo());
        System.out.println("Ano: "+meucarro.getAno());
        System.out.println("Cor: "+meucarro.getCor());

        // ✅ Mudando cor (via setter - com validação)

        meucarro.setCor("Azul");

        // ❌ Tentando mudar marca (não tem setter)
        // meuCarro.setMarca("Chevrolet");  // ERRO! Não existe esse método

        System.out.println("\n--- TESTANDO MÉTODOS ---");

        // Usando métodos para interagir com o carro

       meucarro.mostrarInfo();
       meucarro.abastecer(30);
       meucarro.ligar(true);meucarro.acelera(20);
       meucarro.frear(30);
       meucarro.desligar();
    }
}
