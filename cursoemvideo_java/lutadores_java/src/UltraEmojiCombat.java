public class UltraEmojiCombat {
    public static void main(String[] args) throws Exception {
       Lutador l[] = new Lutador [6];
       
       l[1] = new Lutador("Pretty boy", "EUA", "Masculino", 30, 1.90f, 75.6f, 13, 2, 1);
       l[2] = new Lutador("Dead Code", "Brasil", "Masculino", 28, 1.87f, 70.9f, 15, 4, 0);
       l[3] = new Lutador("Vanessa Kimberly", "Espanha", "Feminino", 26, 1.74f, 58.5f, 13, 1, 2);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
    }
}
