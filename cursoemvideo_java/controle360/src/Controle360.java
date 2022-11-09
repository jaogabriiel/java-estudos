public class Controle360 implements Controlador{
    private boolean andar;
    private boolean correr;
    private boolean pular;
    private boolean abaixar;
    private boolean atirar;
    private boolean ligado;
    private boolean carregar;

    public Controle360() {
        this.ligado = false;
    }

    private boolean getAndar() {
        return this.andar;
    }
    private void setAndar(boolean andar) {
        this.andar = andar;
    }

    private boolean getCorrer() {
        return this.correr;
    }
    private void setCorrer(boolean correr) {
        this.correr = correr;
    }

    private boolean getPular() {
        return this.pular;
    }
    private void setPular(boolean pular) {
        this.pular = pular;
    }

    private boolean getAbaixar() {
        return this.abaixar;
    }
    private void setAbaixar(boolean abaixar) {
        this.abaixar = abaixar;
    }

    private boolean getAtirar() {
        return this.atirar;
    }
    private void setAtirar(boolean atirar) {
        this.atirar = atirar;
    }

    private boolean getLigado() {
        return this.ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private  boolean getCarregar() {
        return this.carregar;
    }

    private  void setCarregar(boolean carregar) {
        this.carregar = carregar;
    }

    @Override
    public void ligar() {
        if (this.getLigado() == false) {
           this.setLigado(true);
           System.out.println("Controle ligado!");
        } else {
            System.out.println("O controle já está ligado!");
        }
    }

    @Override
    public void desligar() {
        if (this.getLigado()) {
            this.setLigado(false);
            System.out.println("Controle desligado!");
        } else {
            System.out.println("O controle já está desligado!");
        }
    }

    @Override
    public void carregar() {
        if (this.getCarregar()) {
            System.out.println("Controle já está carregando");
        } else {
           this.setCarregar(true);
           System.out.println("Carregando...");
        }
    }

    @Override
    public void andar() {
        if (this.getLigado()) {
            this.setAndar(true);
            System.out.println("Andando...");
        } else {
            System.out.println("Impossível executar essa ação!");
        }
    }

    @Override
    public void correr() {
        if (this.getLigado()) {
            this.setCorrer(true);
            System.out.println("Correndo...");
        } else {
            System.out.println("Impossível executar essa ação!");
        }
    }

    @Override
    public void pular() {
        if (this.getLigado()) {
            this.setPular(true);
            System.out.println("Pulando...");
        } else {
            System.out.println("Impossível executar essa ação!");
        }
    }

    @Override
    public void abaixar() {
        if (this.getLigado()) {
            this.setAbaixar(true);
            System.out.println("Abaixando...");
        } else {
            System.out.println("Impossível executar essa ação!");
        }
    }

    @Override
    public void atirar() {
        if (this.getLigado()) {
            this.setAtirar(true);
            System.out.println("Atirando!");
        } else {
            System.out.println("Impossível executar essa ação!");
        }
    }

    @Override
    public void abrirConfig() {
        System.out.println("----------------------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está carregado? " + this.getCarregar());
        System.out.println("Está andando? " + this.getAndar());
        System.out.println("Está correndo? " + this.getCorrer());
        System.out.println("Está pulando? " + this.getPular());
        System.out.println("Está abaixado? " + this.getAbaixar());
        System.out.println("Está atirando " + this.getAtirar());
    }
}
