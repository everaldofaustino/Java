package OrientadaAObjetos;


public class TesteProduto {

    public static void main(String[] args) {


        Produto p1 = new Produto();

        p1.nome = "Canetas";
        p1.preco = 8.00;
        p1.quantidade = 8;

        double total = p1.calcularTotal();

        System.out.printf("O valor total do produto é: R$ %.2f", total);



    }
}
