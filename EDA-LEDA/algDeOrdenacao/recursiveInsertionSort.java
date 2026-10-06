public class recursiveInsertionSort{
    public static void recursiveInsertionSort(int[] v){
        recursiveInsertionSort(v, v.length);
    }
    private static void recursiveInsertionSort(int[] v, int n){
        if(n <= 1) return;
        recursiveInsertionSort(v, n - 1);
        int j = n -1;
        while (j > 0 && v[j] < v[j - 1]) {
            swap(v, j, j -1);
            j--;
        }
    }
    private static void swap(int[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}
