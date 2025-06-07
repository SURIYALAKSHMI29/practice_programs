public class nearestGreaterElement {
    public static void main(String[] args) {
        int[] arr = {9, 3, 11, 4, 29, 10, 12, -1, 0};
        int n = arr.length;

        for(int i=0; i<n; i++){
            int nextGreater = arr[i];
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i] && (nextGreater==arr[i] || nextGreater>arr[j])){
                    nextGreater=arr[j];
                }
            }
            arr[i] = nextGreater==arr[i]? -1: nextGreater;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
