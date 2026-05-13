public class ordquadratica {


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
    for(int i = 1; i< values.length; i++){
        int atual = values[i];
        int j = i - 1;
        while (j>= 0 && values[j] > atual){
            values[j +1] = values[j];
            j--;
        }
        values[j + 1] = atual;
    }
}

public static void bubbleSort(int[] values){
    for(int i = 0; i < values.lenght - 1; i++){
        for(int j = 0; j < values.lenght - 1; j++){
            if (values[j] > values[j + 1]){
                int aux = values[j];
                values[j] = values[j+1]
                values[j + 1] = aux;
            }
        }
    }
}
}
