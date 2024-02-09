public class Personagem extends Posicao {
    private String name;

    public Personagem (int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public String toString() {
        return name + ": " + exibePosicao();
    }

    public int getSize() {
        return 1;
    }
}