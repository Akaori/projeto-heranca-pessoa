public abstract class Funcionario extends Pessoa {
    private String matricula;

    public Funcionario(String nome, Integer idade, String sexo) {
        super(nome, idade, sexo);
    }

    public abstract Double calcularSalario();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
