package obj;
import util.Speaker;

public class Personagem extends Objeto implements Speaker {
    private String name;

    public Personagem (int x, int y, String name) {
        super(x,y);
        this.name = name;
    }

    public void speak() {
        System.out.println("Oi");
    }

    public String toString() {
        return name + ": " + exibePosicao();
    }

    public String getName () {
        return this.name;
    }

    public int getSize() {
		return 1;
	}
}