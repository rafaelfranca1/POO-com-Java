public class Retangulo extends Figura {
    private double a;
    private double b;

    public Retangulo(double a, double b, String cor) {
        super(cor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double area() {
        return this.a * this.b;
    }

    public String toString() {
        return "Retangulo [a=" + a + ", b=" + b + ", cor=" + getCor() + "]";
    }
}
