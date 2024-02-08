import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu peso em quilos: ");
        double massa = Double.parseDouble(scan.nextLine());

        System.out.print("Informe sua altura em metros: ");
        double altura = Double.parseDouble(scan.nextLine());

        scan.close();

        CalculoIMC calculo = new CalculoIMC(massa, altura);

        double imc = calculo.calcularIMC();

        calculo.classificarIMC(imc);
    }
}