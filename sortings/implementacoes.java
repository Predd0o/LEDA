public class implementacoes {


public static void selectionSort(int[] values){
    for(int i = 0; i < values.length -1; i ++){
        int min = i;
        for (int j = i + 1; j < values.length; j++){
            if(values[j] < values[min]){
                min = j;
            }
        }
        int aux = values[min];
        values[min] = values[i];
        values[i] = aux;
    }
}

public static void insertionSort(int[] values){
    // implementar
}

}
