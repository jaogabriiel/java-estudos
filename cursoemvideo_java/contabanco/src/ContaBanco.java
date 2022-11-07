
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        status = false;
    }

    public void abrirconta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC") {
            saldo = 50;
        } else {
            saldo = 150;
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro!");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v) {
        if (status = true) {
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float v) {
        if (status = true) {
            if (saldo > v){
                saldo = saldo - v;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(float v) {
        if (tipo == "CC") {
            v = 12;
        } else if (tipo == "CP") {
            v = 20;
        }
        if (status = true) {
            if (saldo > v) {
                saldo = saldo - v;
            } else {
                System.out.println("Impossível pagar");
            }
        }
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
