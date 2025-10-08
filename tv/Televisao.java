import java.util.Scanner;

public class Televisao
{
    private boolean ligada;
    private int volume;
    private int canal;
    
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
    
    public void aumentarVolume(int novoVolume) {
        if(novoVolume > 100) volume = 100;
        else if(novoVolume < 0) volume = 0;
        else volume = novoVolume;
    }
    
    public void mudarCanal(int novoCanal) {
        if(ligada)
            canal = novoCanal;
    }
    
    private String getEstado() {
        if (ligada) return "Ligada";
        return "Desligada";
    }
    
    public void mostrarEstado() {
        System.out.println("\n\n"+
        "Status da Televisão: \n"+
        "\n\t Canal : " + canal  +
        "\n\t Volume: " + volume +
        "\n\t Estado: " + getEstado()
        );
    }
}