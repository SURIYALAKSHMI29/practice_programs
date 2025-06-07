public class sortFrontBack {
    static int findMin(int[] arr, int left, int right){
        int min = arr[left];
        int minIndex = left;
        for(int i=left; i<=right; i++){
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {17, 11, 7, 9, 14,3 ,6};
        int start = 0;
        int end = arr.length-1;
        boolean isFront = true;
        while(start<end){
            int index = findMin(arr, start, end);
            if(isFront){
                swap(arr, start, index);
                start++;
            }
            else{
                swap(arr, end, index);
                end--;
            }
            isFront = !isFront;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
