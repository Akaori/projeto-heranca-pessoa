public class Atendente extends Funcionario {
    private Double horasTrabalhadas;

    public Atendente(String nome, Integer idade, String sexo) {
        super(nome, idade, sexo);
    }

    public Atendente(String nome, Integer idade, String sexo, Double horasTrabalhadas) {
        super(nome, idade, sexo);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public Double calcularSalario() {
        Double salario = horasTrabalhadas * 50.00;
        System.out.printf("O salário do(a) Atendente %s é de R$ %.2f%n", this.getNome(), salario);
        return salario;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
