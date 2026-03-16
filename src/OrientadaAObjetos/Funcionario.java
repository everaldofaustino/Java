package OrientadaAObjetos;

public class Funcionario {

    //Crie uma classe Funcionario com os atributos nome, cargo e salario. Implemente métodos para
    // definir e obter os valores dos atributos, bem como um método para aumentar o salário em uma certa porcentagem.

    String nome;
    String cargo;
    double salario;

    double aumentarSalario(){

        return salario *1.2;
    }
}
