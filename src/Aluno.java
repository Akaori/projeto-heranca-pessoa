public class Aluno extends Pessoa {
    private String matricula;
    private Integer frequencia;
    private Double[] notas;

    public Aluno(String nome, Integer idade, String sexo) {
        super(nome, idade, sexo);
    }

    public Aluno(String nome, Integer idade, String sexo, String matricula, Integer frequencia, Double[] notas) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.frequencia = frequencia;
        this.notas = notas;
    }

    protected Double calcularMedia() {
        if (notas.length >= 1) {
            Double soma = 0.0;
            for (Double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.length;
            return media;
        } else {
            System.out.println("Ainda não há notas registradas!");
            return -1.0;
        }
    }

    public boolean checarSePassou() {
        Double media = this.calcularMedia();

        if (media != -1.0) {
            if (media >= 6.00 && this.getFrequencia() >= 60) {
                System.out.printf(
                        "O aluno %s passou com uma média de %.2f e frequência de %d%%%n",
                        this.getNome(),
                        media,
                        this.getFrequencia()
                );
                return true;
            }
            System.out.printf(
                    "O aluno %s não passou.%n" +
                            "É necessário média maior ou igual a 6.0 " +
                            "e frequência maior ou igual a 60%%%n" +
                            "A média foi de %.2f e a frequência de %d%%%n",
                    this.getNome(),
                    media,
                    this.getFrequencia()
            );
            return false;
        } else {
            return false;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Integer frequencia) {
        this.frequencia = frequencia;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
}
