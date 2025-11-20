public class Aluno {
    private String Matricula;
    private String Nome;
    private String Email;

    public Aluno(String matricula, String nome, String email) {
        this.Matricula = matricula;
        this.Nome = nome;
        this.Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t" + Nome + " | ");
        sb.append(Matricula + " | ");
        sb.append(Email);
        return sb.toString();
    }
}

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
