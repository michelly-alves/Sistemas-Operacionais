public class InverterColunaRunnable implements Runnable {
    int coluna;
    int[][] matriz;

    public InverterColunaRunnable(int coluna, int[][] matriz) {
        this.coluna = coluna;
        this.matriz = matriz;
    }

    @Override
    public void run() {
        int top = 0;
        int bottom = matriz.length - 1;

        while (top < bottom) {
            int temp = matriz[top][coluna];
            matriz[top][coluna] = matriz[bottom][coluna];
            matriz[bottom][coluna] = temp;
            top++;
            bottom--;
        }

        System.out.println("\nThread da coluna " + coluna + " finalizada.");
        imprimirMatriz(matriz);
    }

    private void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
