public class Tecnico extends Aluno {
    private boolean registroProfissional;

    public void praticar() {
        System.out.println("Praticando...");
        this.setRegistroProfissional(true);
    }

    public boolean getRegistroProfissional() {
        return this.registroProfissional;
    }
    public void setRegistroProfissional(Boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
