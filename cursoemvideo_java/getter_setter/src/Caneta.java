public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void destampar() {
        this.tampada = false;
    }
    public void tampar() {
        this.tampada = true;
    }

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
    }
}
