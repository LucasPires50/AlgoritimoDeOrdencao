package algoritimodeordencao;

public class AlgoritimoDeOrdencao {

    public static void main(String[] args) {

        int[] arrayDesorndenado = {9, 3, 5, 4, 6, 7, 8, 2, 1};

        System.out.println("Array Desordenado: ");
        for (int i = 0; i < arrayDesorndenado.length; i++) {
            System.out.println(arrayDesorndenado[i]);

        }
        System.out.println("\n Array Ordenado Crescente: ");
        //Crescente    
        int[] arrayOrdenado = BubbleSort.bubbleCrescente(arrayDesorndenado);

        for (int i = 0; i < arrayOrdenado.length; i++) {
            System.out.println(arrayOrdenado[i]);

        }

        int[] arrayDesorndenado2 = {9, 3, 5, 4, 6, 7, 8, 2, 1};

        System.out.println("Array Desordenado: ");
        for (int i = 0; i < arrayDesorndenado2.length; i++) {
            System.out.println(arrayDesorndenado2[i]);

        }
        System.out.println("\n Array Ordenado Decrescente: ");

        //Decrescente
        int[] arrayOrdenado2 = BubbleSort.bubbleDecrescente(arrayDesorndenado);

        for (int i = 0; i < arrayOrdenado2.length; i++) {
            System.out.println(arrayOrdenado2[i]);

        }
    }

}
