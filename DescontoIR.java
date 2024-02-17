public class DescontoIR {
    double salarioBruto;

    public DescontoIR(double salario) {
        this.salarioBruto = salario;
    }

    public double salarioLiquido(double salario) {
        if (salario > 4664.68) {
            return salario - (salario * 0.275 - 869.36);
        } else if (salario > 3751.05) {
            return salario - (salario * 0.225 - 636.13);
        } else if (salario > 2826.65) {
            return salario - (salario * 0.15 - 354.80);
        } else if (salario > 1903.33) {
            return salario - (salario * 0.075 - 142.80);
        } else {
            return salario;
        }
    }
}
