
/**
 * Write a description of class app here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class app
{
    public static float[] Interseccao(float[]v1, float[]v2) {
        int interLen = 0;

        for(int i = 0; i < v1.length; i++) {
            for(int j = 0; j < v2.length; j++) {
                if(v1[i] == v2[j]) {
                    interLen ++;
                }
            }
        }

        float[] inter = new float[interLen];

        float[] concat = Concat(v1, v2);
        
        int adicionado = 0;
        
        for(int i = 0; i < concat.length; i++) {
            float elemento = concat[i];
            boolean estaEmv1 = ContemElemento(elemento, v1);
            boolean estaEmv2 = ContemElemento(elemento, v2);
            if(estaEmv1 && estaEmv2) {
                for(int k = adicionado; k < inter.length; k++) {
                    boolean jaAdd = ContemElemento(elemento, inter);
                     if(jaAdd == false) {
                        inter[k] = elemento;
                        adicionado ++;
                    }
                }
            }
        }
        
        return inter;
    }

    public static boolean ContemElemento(float e, float[]v) {
        for(int i = 0; i < v.length; i++) {
            if (e == v[i]) return true;
        }

        return false;
    }

    public static float[] Concat(float[]v1, float[]v2) {
        float[] concat = new float[(v1.length + v2.length)];

        for(int i = 0; i < v1.length; i++) {
            concat[i] =v1[i];
        }

        for(int i = 0; i < v2.length; i++) {
            concat[(v1.length) + i] = v2[i];
        }

        return concat;
    }

    public static void ExVetor(float[] v1) {
        for(int i = 0; i < v1.length; i++) {
            System.out.println("Elemento["+i+"]: " + v1[i]);
        }

        System.out.println("Len: " + v1.length);
    }

    public static void main (String args[]) {        
        float[] v1 = new float [] {21, 9, 7, 8, 6};
        float[] v2 = new float [] {21, 6, 9};

        float [] inter = Interseccao(v1, v2);
        float [] conc = Concat(v1, v2);
        //ExVetor(conc);
        System.out.println("Interseccao: ");
        ExVetor(inter); 
    }
}