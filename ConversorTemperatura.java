import java.util.*;

public class ConversorTemperatura {
    private double celsius;
    private double kevin;
    private double fahrenheit;

    public ConversorTemperatura() {
        this.menu();
    }

    public void menu() {
        System.out.print("MENU - Conversor de Temperaturas \n1. Fahrenheit para Celsius \n2. Fahrenheit para Kelvin \n3. Celsius para Fahrenheit \n4. Celsius para Kelvin \n5. Kelvin para Fahrenheit \n6. Kelvin para Celsius \nEscolha a opção desejada: ");

        Scanner scan = new Scanner(System.in);

        int escolha = scan.nextInt();
        scan.nextLine();

        switch (escolha) {
            case 1:
                fahrenheitParaCelsius();
                break;
            case 2:
                fahrenheitParaKevin();
                break;
            case 3:
                celsiusParaFahrenheit();
                break;
            case 4:
                celsiusParaKevin();
                break;
            case 5:
                kevinParaFahrenheit();
                break;
            case 6:
                kevinParaCelsius();
                break;
            default:
                break;
        }

        scan.close();
    }

    private void fahrenheitParaCelsius() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        String temp = scan.nextLine();
        this.fahrenheit = Double.parseDouble(temp);

        this.celsius = (this.fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura em Celsius: " + this.celsius);
        scan.close();
    }

    private void fahrenheitParaKevin() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        String temp = scan.nextLine();
        this.fahrenheit = Double.parseDouble(temp);

        this.kevin = ((this.fahrenheit - 32) * 5 / 9) + 273.15;

        System.out.println("Temperatura em Kelvin: " + this.kevin);
        scan.close();
    }

    private void celsiusParaKevin() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        String temp = scan.nextLine();
        this.celsius = Double.parseDouble(temp);

        this.kevin = this.celsius + 273.15;

        System.out.println("Temperatura em Kelvin: " + this.kevin);
        scan.close();
    }

    private void celsiusParaFahrenheit() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        String temp = scan.nextLine();
        this.celsius = Double.parseDouble(temp);

        this.fahrenheit = ((this.celsius * 9) / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + this.fahrenheit);
        scan.close();
    }

    private void kevinParaFahrenheit() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Kelvin: ");
        String temp = scan.nextLine();
        this.kevin = Double.parseDouble(temp);

        this.fahrenheit = ((this.kevin - 273.15) * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + this.fahrenheit);
        scan.close();
    }

    private void kevinParaCelsius() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Kelvin: ");
        String temp = scan.nextLine();
        this.kevin = Double.parseDouble(temp);

        this.celsius = this.kevin - 273.15;

        System.out.println("Temperatura em Celsius: " + this.celsius);
        scan.close();
    }
}
