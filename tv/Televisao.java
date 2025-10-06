
import java.util.Scanner;

public class Televisao
{
    private boolean ligada;
    private int volume;
    private int canal;

    /**
     * Constructor for objects of class Televisao
     */
    public Televisao()
    {
        ligada = false;
        volume = 10;
        canal = 1;
    }

    
    public void ligar()
    {
        ligada = true;
    }
    
    public void desligar() {
        ligada = false;
    }
    
    public void aumentarVolume() {
        volume = 100;
    }
    
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    
    private String getEstado() {
        if (ligada) return "Ligada";
        return "Desligada";
    }
    
    public void mostrarEstado() {
        System.out.println("\n"+
        "Status da Televisão: \n"+
        "\n\t Canal : " + canal  +
        "\n\t Volume: " + volume +
        "\n\t Estado: " + getEstado()
        );
    }
}