import java.util.Random;

public class Luta {
    private Lutador desafiado; 
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada; 

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2 && l1.getSexo() == l2.getSexo()) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("A luta não acontecer!");
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===== RESULTADO DA LUTA =====");
            switch (vencedor) {
                case 0: 
                    System.out.println("Empatou!");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitótia do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("==============================================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}