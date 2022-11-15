public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(float v) {
        this.salario = this.salario + v;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
