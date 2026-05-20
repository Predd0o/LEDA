package countingSorts;

public class lomuto {

    public void quickSort(int[] values, int left, int right){
        if(left < right){
            int pivot = partitionLomuto(values, left, right);
            quickSort(values, left, pivot - 1);
            quickSort(values, pivot + 1, right);
        }
    }
    public int partitionLomuto(int[] values, int left, int right){
        int pivot = values[left];
        int i = left;

        for(int j = left + 1; j <= right; j++){
            if(values[j] <= pivot){
                i++;
                swap(values, i, j);
            }
        }
        swap(values, left,i);
        return i;
    }
    private void swap(int[] values, int i, int j) {
        int aux = values[i];
        values[i] = values[j];
        values[j] = aux;
    }

    }
