public class Main {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao("abcdef",2002,24);
        Veiculo onibus = new Onibus("mnopqr", 2005, 48);

        System.out.println(caminhao.exibirDados());
        System.out.println(onibus.exibirDados());
    }
}
