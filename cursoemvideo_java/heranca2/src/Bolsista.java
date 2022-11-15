public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    public void pagarMensal() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return this.bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
