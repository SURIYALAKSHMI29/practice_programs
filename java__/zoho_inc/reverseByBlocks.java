public class reverseByBlocks {

    static void reverse(int[] arr, int start, int size, int n){
        if(size>=n){
            size = n-1;
        }
        while(start<size){
            int temp = arr[start];
            arr[start] = arr[size];
            arr[size] = temp;
            start++;
            size--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,9,13,5,3,0,29};
        int blockSize = 4;
        int n = arr.length;

        for(int i=0; i<n; i+=blockSize){
            reverse(arr, i, i+blockSize-1, n);
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
