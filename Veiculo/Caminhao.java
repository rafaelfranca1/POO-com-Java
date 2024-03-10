public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public String exibirDados() {
        return "Caminhao [placa = " + getPlaca() + ", ano = " + getAno() + ", eixos = " + eixos + "]";
    }
}
