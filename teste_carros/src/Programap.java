public class Programap {
    public static void main(String[] args) throws Exception {
        Celular celularA = new Celular();
        celularA.setNome("Iphone 14");
        celularA.setMemoria(256);
        celularA.setLigado(true);
        celularA.setPreco(2000);
        celularA.setTela(7.3f);
        celularA.setSistemaOperacional("IOS");

        System.out.println(celularA.toString());
        celularA.negociar();
    }
}
