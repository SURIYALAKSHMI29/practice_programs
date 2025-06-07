public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,-1,10,7};
        int arrLen = arr.length;

        int left = 0, right = arrLen-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2!=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp; 
                left++;
                right--;
            }
            else if(arr[left]%2==0){
                left++;
            }
            else{
                right--;
            }
        }

        for(int i=0; i<arrLen; i++){
            System.out.print(arr[i]+" ");
        }
    }

}



// while(left<right){
//             if(arr[left]%2==0){
//                 left++;
//                 continue;
//             }
//             if(arr[right]%2==0){
//                 right--;
//                 continue;
//             }
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp; 
//             left++;
//             right--;
//         }