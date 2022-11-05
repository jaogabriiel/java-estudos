public class App {
    public static void main(String[] args) throws Exception {
        Celular celularA = new Celular();
        celularA.nome = "Iphone 14";
        celularA.sistemaOperacional = "IOS";
        celularA.memoria = 256;
        celularA.tela = 6.1f;
        celularA.ligado = true;

        Celular celularB = new Celular();
        celularB.nome = "Samsung Galaxy A22";
        celularB.sistemaOperacional = "Android";
        celularB.memoria = 126;
        celularB.tela = 6.4f;
        celularB.ligado = false;

        System.out.format("O celular %s tem %dgb de memória, possui o %s como sistema operacional e uma tela de %.1f polegadas %b\n", celularA.nome, celularA.memoria, celularA.sistemaOperacional, celularA.tela);
        System.out.format("O celular %s tem %dgb de memória, possui o %s como sistema operacional e uma tela de %.1f polegadas\n", celularB.nome, celularB.memoria, celularB.sistemaOperacional, celularB.tela);
    }
}
