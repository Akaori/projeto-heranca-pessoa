public abstract class Pessoa {
    private String nome;
    private Integer idade;
    private String sexo;

    public Pessoa(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public final void comer() {
        System.out.printf("%s está comendo...%n", this.nome);
    }

    public final void dormir() {
        System.out.printf("%s está dormindo...%n", this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
