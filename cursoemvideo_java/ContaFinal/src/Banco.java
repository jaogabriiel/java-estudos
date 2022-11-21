public class Banco extends Pessoa {

    public void criarConta() {
        if (getConta() != true) {
            setConta(true);
            System.out.println("Conta criada com sucesso");
        } else {
            System.out.println("Você já possui uma conta");
        }
    }

    public void depositar() {
        if (getConta()) {
            float x;
            this.setSaldo(this.getSaldo());
        } else {
            System.out.println("Você precisa criar uma conta para realizar um depósito");
        }
    }

    public void sacar() {

    }

    public void detalhes() {

    }

    public void cancelarConta() {

    }
}
