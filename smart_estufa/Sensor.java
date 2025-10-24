
/**
 * Write a description of class Sensor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sensor
{
    // instance variables - replace the example below with your own
    private float[] historicoTemperatura;

    public Sensor(int capacidade)
    {
       historicoTemperatura = new float [capacidade];
    }
    
    public int getCapacidade() { return historicoTemperatura.length; }
    
    public void IncluirDado(int posicao, float valor) {
        if(posicao < 0 || posicao > historicoTemperatura.length -1)
            return;
        historicoTemperatura[posicao] = valor;
    }
    
    public void SubstituirPares() {
        for(int i = 0; i < historicoTemperatura.length; i++) {
            if(i%2==0) {
                historicoTemperatura[i] = -2;
                
            }
        }
    }
    
     public void SubstituirImpares() {
        for(int i = 0; i < historicoTemperatura.length; i++) {
            if(i%2!=0) {
                historicoTemperatura[i] = -1;
            }
        }
    }
    
    public float[] Subtrair(float[] dados) {
        float[] res = new float[dados.length];
        
        for(int i =0; i < res.length; i++) {
            res[i] = historicoTemperatura[i] - dados[i];
        }
        
        return res;
    }
    
    
}