public abstract class Animal {
    protected float peso;
    protected int idade;    
    protected int memebros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMemebros() {
        return this.memebros;
    }
    public void setMemebros(int memebros) {
        this.memebros = memebros;
    }
}
