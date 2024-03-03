import java.util.Scanner;

import obj.Caixa;
import obj.Objeto;
import obj.Personagem;

public class Main {
    public static void main(String[] args) {
        Objeto[] cenario = new Objeto[] {
			new Personagem("Frodo", 1, 1),
			new Personagem("Bilbo", 2, 1),
			new Caixa(1, 2, 1, 1)
		};

		Scanner scanner = new Scanner(System.in);

		int n = cenario.length - 1;
		while (true) {
			System.out.println("Escolha um objeto de 0 a " + n + ":");
			int i = Integer.parseInt(scanner.nextLine());
			System.out.println(cenario[i]);
		}

    }
}
