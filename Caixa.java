public class Caixa extends Posicao {
    int width;
    int height;

    public String toString() {
        return "Posicao: " + exibePosicao() + ". Tamanho: " + width + "x" + height;
    }
}