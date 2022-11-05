public class App {
    public static void main(String[] args) throws Exception {
        int numeroComparado = 18;
        if (numeroComparado == 15) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }
        if (numeroComparado != 21) {
            System.out.println("Os números são diferentes");
        } else {
            System.out.println("Os números são iguais");
        }
        if (numeroComparado < 33) {
            System.out.println("33 é maior que 18");
        } else {
            System.out.println("O 33 é menor que 18");
        }
        if (numeroComparado > 19) {
            System.out.println("18 é maior que 19");
        } else {
            System.out.println("19 é maior que 18");
        }
        if ( numeroComparado >= 18) {
            System.out.println("18 é maior ou igual a 18");
        } else {
            System.out.println("18 é menor ou igual a 18");
        }
        if (numeroComparado <= 18) {
                System.out.println("18 é menor ou igual a 18");
         } else {
                System.out.println("18 é maior ou igual a 18");
        }

        String palavra1 = "Sorvete";
        String palavraString2 = "Sorvete";

        if (palavra1.equals(palavraString2)) {
            System.out.println("As palavras são iguais");
        } else {
            System.out.println("As palavras são diferentes");
        }

        String p1 = "Arroz com feijão";
        String p2 = "Arroz com Feijão";

        if (p1.equalsIgnoreCase(p2)) {
            System.out.println("A frase é a mesma");
        } else {
        System.out.println("As palavras são diferentes");
        }

    }
}
