public class OperacaoMatriz {
    public double mediaAbaixoDiagonal(int[][] matriz) {
        double soma = 0;
        double elementos = 0;

        for(int i = 1;i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
                elementos++;
            }
        }

        return elementos != 0 ? soma / elementos : 0;
    }

    public int somaAcimaDiagonal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }

    public double mediaDiagonal(int[][] matriz) {
        double soma = 0;
        double elementos = 0;

        for(int i = 1;i < matriz.length; i++) {
            soma += matriz[i][i];
            elementos++;
        }

        return elementos != 0 ? soma / elementos : 0;
    }

    public int menorMatriz(int[][] matriz) {
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }

    public int somaMatriz(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }
}
