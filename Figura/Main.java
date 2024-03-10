public class Main {
    public static void main(String[] args) {
        Figura retangulo = new Retangulo(2,2,"amarelo");
        Figura quadrado = new Quadrado(2,"verde");
        Figura circulo = new Circulo(2,"azul");
        Figura triangulo = new Triangulo(2,2,"vermelho");

        System.out.println(retangulo.toString());
        System.out.println(quadrado.toString());
        System.out.println(circulo.toString());
        System.out.println(triangulo.toString());
    }
}
