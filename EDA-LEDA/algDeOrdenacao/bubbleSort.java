public class bubbleSort {
    public static void bubbleSort(int[] v){
        for(int i =0; i < v.length; i++){
            for(int j = 0; j < v.length - 1 - i;j++){
                if(v[j] > v[j + 1]) swap(v, j, j + 1);
            }
        }
    }
    private static void swap(int[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}
