package metodos;

public class e0 {
    public double AreaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    public double AreaRetangulo(double base, double altura) {
        return AreaTriangulo(base, altura) * 2;
    }

    public double AreaCirculo(double raio) {
        return 3.14 * (raio * raio);
    }

    public double AreaQuadrado(double base) {
        return AreaRetangulo(base, base);
    }

    public double VolumeParalelepipedo(double comprimento, double altura, double largura) {
        return comprimento * altura * largura;
    }
}
