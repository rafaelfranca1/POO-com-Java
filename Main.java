import java.util.Scanner;

import obj.*;

public class Main {
    public static void main(String[] args) {
        Scene scene = new Scene();

		Scanner scanner = new Scanner(System.in);

		int n = scene.getCenario().length - 1;

		while (true) {
			System.out.print("Escolha um objeto de 0 a " + n + ": ");
			int i = Integer.parseInt(scanner.nextLine());
			System.out.println(scene.getCenario()[i]);
		}

    }
}
