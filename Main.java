import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o coeficiente a: ");
        double a = Double.parseDouble(scan.nextLine());

        System.out.print("Informe o coeficiente b: ");
        double b = Double.parseDouble(scan.nextLine());

        System.out.print("Informe o coeficiente c: ");
        double c = Double.parseDouble(scan.nextLine());

        scan.close();

        EquacaoSGrau equacao = new EquacaoSGrau(a, b, c);

        double delta = equacao.calcularDelta();
        equacao.calcularRaizes(delta);
    }
}