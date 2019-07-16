package algoritimodeordencao;

public class BubbleSort {

    public static int[] bubbleCrescente(int[] vetorDes) {

        int[] vetorOrdenado = vetorDes;
        int aux = 0;

        for (int i = 0; i < vetorDes.length; i++) {
            for (int j = 0; j < (vetorDes.length - 1); j++) {
                if (vetorOrdenado[j] > vetorOrdenado[j + 1]) {
                    aux = vetorOrdenado[j];
                    vetorOrdenado[j] = vetorOrdenado[j + 1];
                    vetorOrdenado[j + 1] = aux;
                }
            }
        }

        return vetorOrdenado;

    }

    public static int[] bubbleDecrescente(int[] vetorCres) {
        int[] vetorOrdenado = vetorCres;
        int aux = 0;

        for (int i = 0; i < vetorCres.length; i++) {
            for (int j = 0; j < (vetorCres.length - 1); j++) {
                if (vetorOrdenado[j] < vetorOrdenado[j + 1]) {
                    aux = vetorOrdenado[j];
                    vetorOrdenado[j] = vetorOrdenado[j + 1];
                    vetorOrdenado[j + 1] = aux;

                }

            }

        }
        return vetorOrdenado;
    }
}
