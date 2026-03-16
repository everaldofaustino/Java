package OrientadaAObjetos;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();

        f.nome = "Paulo";
        f.cargo = "Analista";
        f.salario = 5000;

        double aumento = f.aumentarSalario();
        System.out.printf("O salário do funcionário %s, aumentou para %.2f",f.nome,aumento);

    }
}
