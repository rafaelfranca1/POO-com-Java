public class Retangulo extends Shape {
    public double area() {
        return this.width * this.height;
    }

    public double perimetro() {
        return 2 * (this.width + this.height);
    }
}