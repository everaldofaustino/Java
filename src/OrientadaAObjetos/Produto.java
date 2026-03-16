package OrientadaAObjetos;

public class Produto {

    //Crie uma classe Produto com os atributos nome, preco e quantidade. Implemente
    // métodos para definir e obter os valores dos atributos,
    //bem como um método para calcular o valor total do estoque (preco * quantidade).


        String nome;
        double preco;
        int quantidade;

        double calcularTotal(){

            return preco * quantidade;
        }

}
