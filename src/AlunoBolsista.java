public final class AlunoBolsista extends Aluno {

    public AlunoBolsista(String nome, Integer idade, String sexo) {
        super(nome, idade, sexo);
    }

    public AlunoBolsista(String nome, Integer idade, String sexo, String matricula, Integer frequencia, Double[] notas) {
        super(nome, idade, sexo, matricula, frequencia, notas);
    }

    @Override
    public boolean checarSePassou() {
        Double media = super.calcularMedia();

        if (media != -1.0) {
            if (media >= 8.00 && this.getFrequencia() >= 80) {
                System.out.printf(
                        "O aluno bolsista %s passou com uma média de %.2f e frequência de %d%%%n",
                        this.getNome(),
                        media,
                        this.getFrequencia()
                );
                return true;
            }
            System.out.printf(
                    "O aluno bolsista %s não passou.%n" +
                            "Para bolsistas é necessário média maior ou igual a 8.0 " +
                            "e frequência maior ou igual a 80%%%n" +
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

}
