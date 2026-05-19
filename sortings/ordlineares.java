public class ordlineares {


    public static void mergeSort(int[] values, int left, int right){
        if(left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(values, left, mid);
        mergeSort(values, mid + 1, right);
        merge(values, left, mid, right);
    }

    public static void merge(int[] values, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

    
    }
}
