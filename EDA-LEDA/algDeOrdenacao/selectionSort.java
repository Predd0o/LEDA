public class selectionSort {
    public static void selectionSort(int[] v){
        for(int i = 0; i < v.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < v.length; j++){
                if(v[j] < v[min]) min = j;
            }
            swap(v, i, min);
        }
    }
    private static void swap(int[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}
