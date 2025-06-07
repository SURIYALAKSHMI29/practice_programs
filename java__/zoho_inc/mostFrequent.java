import java.util.*;

public class mostFrequent {
    static void reposition(int[] arr, int[] topCount, int index){
        int n = arr.length;
        for(int i=n-1; i>index; i--){
            arr[i] = arr[i-1];
            topCount[i] = topCount[i-1];
        }
    }
    static void checkMax(int count, int elem, int[] ans, int[] topCount){
        int len = ans.length;
        for(int i=0;i<len; i++){
            if(count>topCount[i]){
                reposition(ans, topCount, i);
                topCount[i] = count;
                ans[i] = elem;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 7, 3, 5, 3, 11, 6, 9, 11, 5, 7, 7, 3, 3, 7, 3};
        Arrays.sort(arr);
        int n = arr.length;
        int count =1, topN = 3; 
        int[] topNValues = new int[topN];
        int[] topCount = new int[topN];
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]){
                count++; 
            }else{
                checkMax(count, arr[i-1], topNValues, topCount);
                count = 1;
            }
        }
        checkMax(count, arr[n-1], topNValues, topCount);

        for(int i=0; i<topN; i++){
            System.out.print(topNValues[i]+" ");
        }
        
    }
}
