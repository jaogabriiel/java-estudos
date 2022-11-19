public class Celular {
    private String nome;
    private String sistemaOperacional;
    private int memoria;
    private int preco;
    private float tela;
    private boolean ligado;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSistemaOperacional() {
        return this.sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getMemoria() {
        return this.memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getPreco() {
        return this.preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

    public float getTela() {
        return this.tela;
    }
    public void setTela(float tela) {
        this.tela = tela;
    }

    public boolean isLigado() {
        return this.ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void negociar() {
        if (preco > 3000) {
            System.out.println("Você quer negociar?");
        } else {
            System.out.println("Vendido");
        }
    }

    @Override
    public String toString() {
        return "Celular [nome=" + nome + ", sistemaOperacional=" + sistemaOperacional + ", memoria=" + memoria
                + ", preco=" + preco + ", tela=" + tela + ", ligado=" + ligado + "]";
    }
}


