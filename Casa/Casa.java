
/**
 * Write a description of class Casa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Casa
{
    // instance variables - replace the example below with your own
    private double largura;
    private double comprimento;

    
    public Casa(double largura, double comprimento)
    {
        setLargura(largura);
        setComprimento(comprimento);
    }

    
    public void setLargura(double x)
    {
        if(x>0) this.largura = x;
        
    }
    
    public double getLargura() { return this.largura; }
    
    public void setComprimento(double x) {
        if(x>0) this.comprimento = x;
    }
    
    public double getComprimento() {return this.comprimento;}
    
    public double calcularArea() {
        return this.largura * this.comprimento;
    }
}