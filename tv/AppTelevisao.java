public class AppTelevisao
{
    public static void main (String args[]) {
        Televisao tv = new Televisao();
        
        tv.ligar();
        tv.mostrarEstado();
        tv.mudarCanal(54);
        tv.aumentarVolume(40);
        tv.mostrarEstado();
        
        tv.aumentarVolume(120);
        tv.mostrarEstado();
        
        tv.desligar();
        
        tv.mudarCanal(30);
        tv.mostrarEstado();
    }
}