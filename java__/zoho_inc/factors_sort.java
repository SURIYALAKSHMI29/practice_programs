import java.util.*;
public class factors_sort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int countFactors(int n){
        int factors = 0;
        int i=1;
        for(i=1; i*i<n; i++){
            if(n%i==0){
                factors+= 2;
            }
        }
        if(i*i == n){
            factors+=1;
        }
        return factors;
    }
    public static void main(String[] args) {
        int[] arr = {11, 6, 16, 27, 9};
        int n = arr.length;
        int[] factors = new int[n];

        for(int i=0; i<n; i++){
            factors[i] = countFactors(arr[i]);
        }

        for(int i=0; i<n; i++){
            int pos = i;
            for(int j=i; j<n; j++){
                if(factors[pos]>factors[j]){
                    pos = j;
                }
            }
            swap(arr, i, pos);
            swap(factors, i, pos);
            System.out.print(arr[i]+" ");
        }

    }
}
