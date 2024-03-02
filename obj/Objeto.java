package obj;

public abstract class Objeto {
    protected int x;
    protected int y;

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Objeto () {}

    public int getSize() {
        return 0;
    }

    public String exibePosicao() {
        return this.x + "," + this.y;
    }
}