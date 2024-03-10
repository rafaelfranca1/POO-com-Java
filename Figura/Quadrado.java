public class Quadrado extends Retangulo {

    public Quadrado(double a, String cor) {
        super(a, a, cor);
    }

    public double area() {
        return getA() * getA();
    }

    public String toString() {
        return "Quadrado [a=" + getA() + ", cor=" + getCor() + "]";
    }
    
}
