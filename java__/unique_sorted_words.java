package javaapplication3;
import java.util.*;
import java.io.*;

public class unique_sorted_words {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String[] arr = new String[n];
        
        for(int i=0; i<n; i++){
            arr[i] = obj.next();
        }

        Arrays.sort(arr, (a,b)-> a.toLowerCase().compareTo(b.toLowerCase()));

        for(int i=0; i<n; i++){
            if(i==0 || !arr[i].equalsIgnoreCase(arr[i-1]) )
                System.out.print(arr[i]+" ");
        }
    }
}

// Time Complexity: O(n log n), due to the sorting step.
// Space Complexity: O(1)