package obj;

public class Scene extends Objeto {
    private Objeto[] cenario;

    public Scene() {
        cenario = new Objeto[] {
            new Personagem(1, 1, "Frodo"),
            new Personagem(2, 1, "Bilbo"),
            new Caixa(1, 2, 1, 1)
        };
    }

    public Objeto[] getCenario() {
        return cenario;
    }
}
