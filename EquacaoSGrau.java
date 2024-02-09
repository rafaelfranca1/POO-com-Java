public class EquacaoSGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    

    public double calcularDelta() {
        return Math.pow(this.b,2) - 4 * this.a * this.c;
    }

    public void calcularRaizes(double delta) {
        //a = 0: equação dde 1 grau, calcule a unicca raiz diretamente
        if (this.a == 0) {
            if (this.b == 0) {
                System.out.println("Nao e uma equaçao valida.");
            } else {
                double raiz = - this.c / this.b;

                System.out.printf("raiz unica: %.2f\n", raiz);
            }
        } else if (delta == 0) { //delta = 0: calcule a unica raiz pela formula de baskara
            double raiz = - this.b / (2 * this.a);

            System.out.printf("raiz unica: %.2f\n", raiz);
        } else if (delta > 0) { //delta > 0: calcule as 2 raizes reais pela formula de baskara
            double raiz1 = (- this.b + Math.sqrt(delta)) / (2 * this.a);
            double raiz2 = (- this.b - Math.sqrt(delta)) / (2 * this.a);

            System.out.printf("raiz 1: %.2f\n", raiz1);
            System.out.printf("raiz 2: %.2f\n", raiz2);
        } else if (delta < 0) { //delta < 0: calcule as 2 raizes complexas pela formula de baskara
            double raizReal = - this.b / (2 * this.a);
            double parteImaginaria = Math.sqrt(Math.abs(delta)) / (2 * this.a);

            double raiz1 = raizReal + parteImaginaria;
            double raiz2 = raizReal - parteImaginaria;


            System.out.printf("raiz 1: %.2f\n", raiz1);
            System.out.printf("raiz 2: %.2f\n", raiz2);
        }
    }
}