public class main {
    public static void main(String[] args) {
        Turma t = new Turma("Fundamentos de programação",
                30, 20);

        t.adicionarAluno(new Aluno("43", "Matheus", "mk@aapl.com"));
        t.adicionarAluno(new Aluno("44", "Barbara", "bb@aapl.com"));
        t.adicionarAluno(new Aluno("1", "Cuquinha", "kuka@aapl.com"));
        System.out.println(t.toString());
    }
}
