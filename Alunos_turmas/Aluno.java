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