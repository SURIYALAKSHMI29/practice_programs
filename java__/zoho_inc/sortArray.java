import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 15, 5, 4, 6};
        int n = arr.length;

        boolean desc = true;   // desc
        for(int i=0; i<n; i++){
            int pos = i;

            int mul = 1; 
            if(!desc){
                mul = -1;
            }
            int value = arr[i]*mul;
            for(int j=i; j<n; j++){
                int optionalValue = arr[j]*mul;
                if(value<optionalValue){
                    pos = j;
                    value =optionalValue;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
            desc = !desc;
           
            // if(order){
            //     for(int j=i; j<n; j++){
            //         if(value<arr[j]){
            //             pos = j;
            //             value = arr[j];
            //         }
            //     }
            // }else{
            //     for(int j=i; j<n; j++){
            //         if(value>arr[j]){
            //             pos = j;
            //             value = arr[j];
            //         }
            //     }
            // }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
