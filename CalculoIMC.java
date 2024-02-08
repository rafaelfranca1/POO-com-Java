public class CalculoIMC {
    private double massa;
    private double altura;

    public CalculoIMC(double massa, double altura) {
        this.massa = massa;
        this.altura = altura;
    }

    public double calcularIMC() {
        return this.massa / (this.altura * this.altura);
    }

    public void classificarIMC(double imc) {
        if (imc < 17 ) {
            System.out.printf("IMC: %.2f\n", calcularIMC());
            System.out.println("Classificacao: Muito abaixo do peso");
        } else if (imc < 18.5) {
            System.out.printf("IMC: %.2f\n", calcularIMC());
            System.out.println("Classificacao: Abaixo do peso");
        } else if (imc < 25) {
            System.out.printf("IMC: %.2f\n", calcularIMC());
            System.out.println("Classificacao: Peso normal");
        } else if (imc < 30) {
            System.out.printf("IMC: %.2f\n", calcularIMC());
            System.out.println("Classificacao: Acima do peso");
        } else if (imc < 35) {
            System.out.printf("IMC: %.2f\n", calcularIMC());
            System.out.println("Classificacao: Obesidade grau I");
        } else if (imc < 40) {
            System.out.printf("IMC: %.2f\n", calcularIMC());
            System.out.println("Classificacao: Obesidade grau II");
        } else {
            System.out.printf("IMC: %.2f\n", calcularIMC());
            System.out.println("Classificacao: Obesidade grau III");
        }
    }
}
