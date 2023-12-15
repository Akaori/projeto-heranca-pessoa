public class Escola {
    public static void main(String[] args) {
        Funcionario joao = new Atendente("João", 23, "masculino", 40.00);
        Funcionario maria = new Professor("Maria", 35, "feminino", 20.00);

        joao.calcularSalario();
        maria.calcularSalario();

        Aluno jorge = new Aluno("Jorge", 15, "masculino", "123", 60, new Double[]{8.0, 5.0, 7.0, 4.0});
        Aluno clarice = new AlunoBolsista("Clarice", 15, "feminino", "345", 60, new Double[]{8.0, 9.0, 7.0, 8.0});

        jorge.checarSePassou();
        clarice.checarSePassou();
    }
}