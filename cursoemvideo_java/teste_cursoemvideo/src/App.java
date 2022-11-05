public class App {
    public static void main(String[] args) throws Exception {
        Televisão t1 = new Televisão();
        t1.marca = "Samsung";
        t1.cor = "Preta";
        t1.preco = 2800;
        t1.tamanho = 55.5f;
        t1.desligar();
        t1.status();
        t1.assistir();

        Televisão t2 = new Televisão();
        t2.cor = "Branca";
        t2.tamanho = 60.2f;
        t2.ligar();
        t2.status();
        t2.assistir();
    }
}
