public class Hreranca2 {
    public static void main(String[] args) throws Exception {
        // Visitante v1 = new Visitante();
        // v1.setNome("Juvenal");
        // v1.setIdade(22);
        // v1.setSexo("M");
        // System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensal();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensal();

        Tecnico t1 = new Tecnico();
        t1.setMatricula(1113);
        t1.setNome("João");
        t1.praticar();
    }
}
