package javaapplication3;
import java.util.*;
import java.io.*;


// gn an positive array, find the largest number you can form by concatenating the numbers.


public class arr_to_num {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }

        Arrays.sort(arr, (a,b)-> {
            String ab = a.toString() + b.toString();
            String ba = b.toString() + a.toString();
            return ba.compareTo(ab);
        });
        
        StringBuilder result = new StringBuilder();
        for(int i=0; i<n; i++){
            result.append(arr[i]);
        }

        System.out.println(Integer.valueOf(result.toString()));
    }
}

// Time: O(n log n * k), where k = average number length
// Space: O(n * k)