public class recursiveSelectionSort{
    public static void selectionSort(int[] v){
        selectionSort(v, v.length);
    }
    
    private static void selectionSort(int[] v, int i){
        if(i >= v.length - 1) return;
        int min = i;
        for (int j = 0; j < v.length; j++) {
            if(v[j] < v[min]) min = j;
        }
        swap(v, i, min);
    }
    private static void swap(int[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}
