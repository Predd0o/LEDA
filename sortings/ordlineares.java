public class ordlineares {


    public static void mergeSort(int[] values, int left, int right) {
        if(left >= right)
            return;
        else{
            int mid = (left + right) / 2;
            mergeSort(values, left, mid);
            mergeSort(values, mid + 1, right);

            merge(values, left, right);
        }
    }

    public static void merge(int[] values, int left,int right){
        int rightHelper = right - left;
        int[] helper = new int[rightHelper + 1];
        for(int i = 0; i <= rightHelper; i++){
            helper[i] = values[left + i];
        }
        int middleHelper = rightHelper / 2;

        int i = 0;
        int j = middleHelper + 1;
        int k = left;

        while (i<= middleHelper && j <= rightHelper){

            if(helper[i] <= helper[i]){
                values[k] = helper[i];
                i++;
            }else{
                values[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middleHelper) {
            values[k] = helper[i];
            i++;
            k++;
        }
    }
}
