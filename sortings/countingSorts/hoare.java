package countingSorts;

public class hoare {
    public void quickSort(int[] values, int left, int right){
        if(left < right){
            int pivot = partitionHoare(values, left, right);
            quickSort(values, left, pivot - 1);
            quickSort(values, pivot + 1, right);
        }
    }

    public int partitionHoare(int values[], int ini, int fim){
        int i = ini + 1 ;
        int j = fim;
        int pivot = values[ini];

        while(i <= j){
            while(i <= j && values[i] <= pivot)
                i++;

            while(i <= j && values[j] > pivot){
                j--;
            }
            if(i < j)
                swap(values, i, j);
        }
        swap(values, i, j);
        return j;
    }
    private void swap(int[] values, int i, int j) {
        int aux = values[i];
        values[i] = values[j];
        values[j] = aux;
    }
}
