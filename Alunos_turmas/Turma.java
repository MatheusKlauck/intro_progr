public class Turma {
    private String Disciplina;
    private int Numero;
    private Aluno[] Alunos = null;
    private int idx_prox_alunos = 0;

    public Turma(String disciplina, int numero, int qtdAlunos) {
        this.Disciplina = disciplina;
        this.Numero = numero;
        this.Alunos = new Aluno[qtdAlunos];
    }

    public void adicionarAluno(Aluno a) {
        if (a == null)
            return;
        for (Aluno b : Alunos)
            if (b != null && a.getMatricula() == b.getMatricula()) {
                System.out.println("Ja existe aluno com essa matricula");
                return;
            }

        this.Alunos[idx_prox_alunos] = a;
        idx_prox_alunos++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n" + Disciplina + " - Turma " + Numero);
        sb.append("\n " + Alunos.length + " alunos matriculados");

        sb.append("\n\tNome | Matricula | E-mail");
        for (Aluno a : Alunos) {
            if (a != null)
                sb.append(a.toString());
        }

        return sb.toString();
    }
}
