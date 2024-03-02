package obj;

public class Caixa extends Objeto {
    int width;
    int height;

    public Caixa(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Posicao: " + exibePosicao() + ". Tamanho: " + width + "x" + height;
    }
}