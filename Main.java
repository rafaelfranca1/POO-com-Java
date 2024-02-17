class Main {
    public static void main(String[] args) {
        DescontoIR desconto = new DescontoIR(4800);

        double salarioLiquido = desconto.salarioLiquido(desconto.salarioBruto);

        System.out.println(salarioLiquido);
    }
}