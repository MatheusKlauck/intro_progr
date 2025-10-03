
/**
 * Write a description of class Aluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aluno
{
    private String nome;
    private int matricula;
    private double frequencia;
    private double p1;
    private double p2;
    private double avgExer;
    private double g1;
    private double g2;
    
    public Aluno(String nome, int matricula)
    {
     this.nome = nome;
     this.matricula = matricula;
     frequencia = 0;
     p1 = 0;
     p2 = 0;
     avgExer = 0;
     g1 = 0;
     g2 = 0;
    }

   
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public double getFrequencia() {
        return this.frequencia;
    }
    
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    
    public double getP1() {
        return this.p1;
    }
    
    public void setP1(double p1) {
        this.p1 = p1;
    }
    
    public double getP2() {
        return this.p2;
    }
    
    public void setP2(double p2) {
        this.p2 = p2;
    }
    
    public double getAvgExer() {
        return this.avgExer;
    }
    
    public void setAvgExer(double avgExer) {
        this.avgExer = avgExer;
    }
    
    public void setG1(double g1) {
        this.g1 = g1;
    }
    
    public double getG2() {
        return this.g2;
    }
    
    public void setG2(double g2) {
        this.g2 = g2;
    }
    
    public void calcularG1() {
        g1 = (p1 + p2 + avgExer) / 3;
    }
    
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
    public boolean aptoG2() {
        if(this.g1 > 5 && frequencia > 60) return true;
        return false;
    }
    
    public boolean estaAprovado() {
        calcularG1();
        
        if(g1 >=7 && frequencia > 75 ) return true;
        return false;
    }
    
    public boolean aprovadoG2() {
        if((this.g1 + this.g2) > 5) return true;
        return false;
    }
}