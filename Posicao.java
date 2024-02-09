public class Posicao {
    protected int x;
    protected int y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String exibePosicao() {
        return this.x + "," + this.y;
    }

    public int getSize() {
        return 0;
    }
}