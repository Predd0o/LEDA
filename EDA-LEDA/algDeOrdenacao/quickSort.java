public class quickSort{
    public static void quiickSort(int[] v, int left, int right){
        if(left < right){
            int index_pivot = partition(v, left, right);
            quickSort(v, left, index_pivot - 1);
            quickSort(v, index_pivot + 1, right)
        }
    }
    public int partition(int[] v, int left, int right){
        int pivot = medianaDeTres(v, left, right);
        int i = left;

        for(int j = left + 1; j <= right; j++){
            if(v[j] <= pivot){
                i++;
                swap(v, i, j);
            }
        }
        swap(v, left, i);
        return i;
    }

    public static int medianaDeTres(int[] v, int left, int right){
        int meio = (left + right) / 2;

        if(v[left] > v[meio]){
            swap(v, left, meio);
        }
        if(v[left] > v[right]){
            swap(v, left, right);
        }
        if(v[meio] > v[right]){
            swap(v, meio, right);
        }
        return meio;
    }

    public static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
}
