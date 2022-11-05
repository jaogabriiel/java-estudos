public class Televisão {
    String marca;
    String cor;
    float tamanho;
    int preco;
    boolean ligada;

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Possui o tamanho de " + this.preco);
        System.out.println("E um preço de " + this.preco);
        System.out.println("Está ligada? " + this.ligada);
    }

    void assistir() {
        if (this.ligada == true) {
            System.out.println("Você pode assistir");
        } else {
            System.out.println("Você não pode assistir");
        }
    }

    void ligar () {
        this.ligada = true;
    }

    void desligar() {
        this.ligada = false;
    }
}
