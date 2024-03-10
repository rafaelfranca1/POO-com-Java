public class Quadrado extends Retangulo {

    public Quadrado(double a, String cor) {
        super(a, a, cor);
    }

    public double area() {
        return this.a * this.a;
    }

    public String toString() {
        return "Quadrado [a=" + a + ", cor=" + cor + "]";
    }
    
}
