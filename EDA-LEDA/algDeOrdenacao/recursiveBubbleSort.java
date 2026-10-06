public class recursiveBubbleSort{
    public static void bubbleSort(int[] v){
        bubbleSort(v, v.length);
    }
    private static void bubbleSort(int[] v, int n){
        if(n <= 1) return;
        for(int j = 0; j < n - 1; j++){
            if(v[j] > v[j + 1]) swap(v, j, j + 1);
        }
        bubbleSort(v, n - 1);
    }
    private static void swap(int[] v, int i, int j){
        temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}
