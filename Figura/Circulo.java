public class Circulo extends Figura {
    double raio;

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return this.raio * 3.14 * 2;
    }

    public String toString() {
        return "Circulo [raio=" + raio + ", cor=" + cor + "]";
    }
}
