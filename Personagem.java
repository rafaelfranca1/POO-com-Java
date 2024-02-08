public class Personagem extends Posicao {
    private String name;

    public Personagem (String name) {
        this.name = name;
    }

    public String toString() {
        return name + ": " + exibePosicao();
    }
}