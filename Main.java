import java.util.Scanner;
import obj.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = new Personagem[] {
			new Personagem(1, 1, "Frodo"),
			new Personagem(2, 1,"Bilbo")
		};

		Scanner scanner = new Scanner(System.in);

		int n = personagens.length - 1;
		while (true) {
			System.out.print("Escolha um personagem de 0 a " + n + ": ");
			int i = Integer.parseInt(scanner.nextLine());
			System.out.print(personagens[i].getName() + " falou: ");
			personagens[i].speak();
		}
    }
}
