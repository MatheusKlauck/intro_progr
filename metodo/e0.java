 
import java.lang.Math;
public class e0 {
    public static double AreaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    public static double AreaRetangulo(double base, double altura) {
        return AreaTriangulo(base, altura) * 2;
    }

    public static double AreaCirculo(double raio) {
        return 3.14 * (raio * raio);
    }

    public static double AreaQuadrado(double base) {
        return AreaRetangulo(base, base);
    }

    public static double VolumeParalelepipedo(double comprimento, double altura, double largura) {
        return comprimento * altura * largura;
    }
    
    public static double VolumePiramide(double largura, double comprimento, double altura) {
        return largura * comprimento * altura / 3;
    }
    
    public static double VolumeEsfera(double raio) {
        double r = raio;
        return 4*3.14*(r*r*r)/3;
    }
    
    public static double VolumeCilindro(double raio, double altura) {
        return 3.14*raio*raio*altura;
    }
    
    public static double SuperficieParalelepipedo(double altura, double largura, double comprimento) {
        double a = altura;
        double b = largura;
        double c = comprimento;
        return 2 * (a*b + a*c + b*c);
    }
    
    public static double SuperficiePiramide(double lados, double comprimentoLado, double altura) {
        double p = lados * comprimentoLado;
        double r = comprimentoLado / (2 * Math.tan(3.14/lados)); // apótema
        double a2 = altura*altura;
        double r2 = r * r;
        double B = p * r / 2; // area da base
        double l = Math.sqrt(a2+r2);
        double al = p * l / 2;
        return B + al;
    }
    
    public static double SuperficieCilindro(double raio, double altura) {
        double pi2 = 3.14*3.14;
        double r2 = raio * raio;
        return 2 * pi2 * r2 + 2 * 3.14 * raio * altura; 
    }
    
    public static double SuperficieEsfera(double raio) {
        double pi2 = 3.14*3.14;
        double r2 = raio * raio;
        return 4 * 3.14 * r2; 
    }
    
    public static void main (String args[]) {
        double base = 4;
        double altura = 4;
        double largura = 2;
        double comprimento = 6;
        double raio = 8;
        
        System.out.println("Considerando ");
        System.out.println("    Base        : " + base);
        System.out.println("    Altura      : " + altura);
        System.out.println("    Largura     : " + largura);
        System.out.println("    Comprimento : " + comprimento);
        System.out.println("    Raio        : " + raio);
        
        
        System.out.println("Area Triangulo              : " + AreaTriangulo(base, altura));
        System.out.println("Area Retangulo              : " + AreaRetangulo(base, altura));
        System.out.println("Area Circulo                : " + AreaCirculo(raio));
        System.out.println("Area Quadrado               : " + AreaQuadrado(base));
        System.out.println("Volume Paralelepipedo       : " + VolumeParalelepipedo(comprimento, altura, largura));
        System.out.println("Volume Piramide             : " + VolumePiramide(largura, comprimento, altura));
        System.out.println("Volume Esfera               : " + VolumeEsfera(raio));
        System.out.println("Volume Cilindro             : " + VolumeCilindro(raio, altura));
        System.out.println("Superficie Paralelepipedo   : " + SuperficieParalelepipedo(altura, largura, comprimento));
        System.out.println("Superficie Piramide 4 lados : " + SuperficiePiramide(4, comprimento, altura));
        System.out.println("Superficie Cilindro         : " + SuperficieCilindro(raio, altura));
        System.out.println("Superficie Esfera           : " + SuperficieEsfera(raio));
    
    
    }
}
