import java.util.Scanner;
import obj.*;

public class Main {
    public static void main(String[] args) {
        Scene scene = new Scene();

		Scanner scanner = new Scanner(System.in);

		int n = scene.getCenario().length - 1;

		while (true) {
			int i = -1;
			try {
				System.out.print("Escolha um objeto de 0 a " + n + ": ");
				i = Integer.parseInt(scanner.nextLine());
				System.out.println(scene.getCenario()[i]);
			} catch (IndexOutOfBoundsException e) {
        		System.out.println("Indice " + i + " fora dos limites do comprimento: " + (n + 1));
			} catch (NumberFormatException e) {
				System.out.println("A entrada eh apenas numeros");
			}
		}

    }
}
