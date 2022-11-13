public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver() {
        this.idade = this.idade + 1;
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    private String getNome() {
        return this.nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    private int getIdade() {
        return this.idade;
    }
    private void setIdade(int idade) {
        this.idade = idade;
    }

    private String getSexo() {
        return this.sexo;
    }
    private void setSexo(String sexo) {
        this.sexo = sexo;
    }


}
