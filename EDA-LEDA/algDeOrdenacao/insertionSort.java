public public class insertionSort {
    public static void insertionSort(int[] v){
        for(int i = 1; i < v.length; i++){
            int j = i;
            while (j > 0 && v[j] < v[j - 1]) {
                swap(v, j, j-1);
                j--;
            }
        }
    }
    private static void swap(int[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}
