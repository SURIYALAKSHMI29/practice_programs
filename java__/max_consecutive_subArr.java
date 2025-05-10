package javaapplication3;
import java.util.*;
import java.io.*;

public class max_consecutive_subArr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        int curr = arr[0];
        int count = 1;
        int max = -1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 1;
                curr = arr[i];
            }
        }
        max = Math.max(max, count);
        System.out.println(max==1? "Not found":max);
    }
}


// Time Complexity: O(n)
// Space Complexity: O(1)