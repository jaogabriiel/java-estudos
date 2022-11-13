public class Livro implements publicacao {
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + "\n, totalPag=" + totalPag + 
            ", pagAtual="+pagAtual
            + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + 
            ", idade=" + leitor.getIdade() +
            ", sexo=" + leitor.getSexo() +"]";    
    }

    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpag() {
        return this.totalPag;
    }
    public void setTotalpag(int totalpag) {
        this.totalPag = totalpag;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totalPag) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual = pagAtual + 1;
    }

    @Override
    public void voltarPag() {
        this.pagAtual = pagAtual - 1;
    }
}
