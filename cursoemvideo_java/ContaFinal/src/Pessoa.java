public abstract class Pessoa {
    private String nome;
    private String email;
    private int idade;
    private float saldo;
    private int cpf;
    private boolean conta;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getCpf() {
        return this.cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public boolean getConta() {
        return this.conta;
    }
    public void setConta(boolean conta) {
        this.conta = conta;
    }

    
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", email=" + email + ", idade=" + idade + ", saldo=" + saldo + ", cpf=" + cpf
                + ", conta=" + conta + "]";
    }

}