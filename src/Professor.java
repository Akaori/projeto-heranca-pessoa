public final class Professor extends Funcionario {
    private Double horasExtras;

    public Professor(String nome, Integer idade, String sexo) {
        super(nome, idade, sexo);
    }

    public Professor(String nome, Integer idade, String sexo, Double horasExtras) {
        super(nome, idade, sexo);
        this.horasExtras = horasExtras;
    }

    @Override
    public Double calcularSalario() {
        Double salario = 5000.00 + (horasExtras * 80.00);
        System.out.printf("O salário do(a) Professor(a) %s é de R$ %.2f%n", this.getNome(), salario);
        return salario;
    }

    public Double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Double horasExtras) {
        this.horasExtras = horasExtras;
    }
}
