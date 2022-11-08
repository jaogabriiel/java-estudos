public class facul {
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

         int resultado1 = 15 + 12;
         int resultado2 = 22 + 33;
         if (resultado1 == 27 && resultado2 == 55) {
             System.out.println("As condições foram atendidas!");
         } else {
             System.out.println("As condições não foram atendidas!");
         }
         if (resultado1 > 27 || resultado2 == 55) {
             System.out.println("Uma condição ou outra foi atendida");
         } else {
             System.out.println("Nenhuma das cindições foi atendida");
         }
         if (!(resultado1 == 28) && resultado1 ==55) {
             System.out.println("As condições foram atendidas");
         } else {
             System.out.println("As condições não foram atendidas");
         }
         if (!(resultado1 > 27 || resultado2 == 55)) {
            System.out.println("Uma ou outra condição foi atendida");
         } else {
            System.out.println("Nenhua das condições foram atendidas");
         }

        boolean verdadeiro = true;
        if (verdadeiro) {
            System.out.println("A condição é verdadeira");
        } else {
            System.out.println("A condição é falsa");
        }

        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;

        if (numero1 != 10) {
            System.out.println("O primeiro número é diferente de 10");
        } else if (numero2 == 30) {
            System.out.println("O segundo número é igual a 30");
        } else if (numero3 < 20) {
            System.out.println("O terceiro número é menor que 20");
        } else if (numero4 > 40) {
            System.out.println("O quarto número é maior que 40");
        } else {
            System.out.println("Nenhuma condição foi atendida");
        }

        System.out.println(numero1 != 10 ? "é diferente de 10" : "é igual a 10");

        switch (numero1) {
            case 8: System.out.println("O número é igual a 8");
            break;
            case 9: System.out.println("O número é 9");
            break;
            case 10: System.out.println("O número é 10");
            break;
            default: System.out.println("O número não é 8, 9 ou 10");
            break;
        }
    }
}
