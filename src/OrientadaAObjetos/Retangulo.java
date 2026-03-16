package OrientadaAObjetos;

public class Retangulo {
    //Crie uma classe Retangulo com os atributos largura e altura. Implemente métodos para calcular a área e o perímetro do retângulo.


    double largura;
    double altura;


    double CalcularArea(){

        return largura * altura;
    }

    double CalcularPerimetro(){

        return (2*largura)  +(2*altura);
    }

}
