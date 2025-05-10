package javaapplication3;
import java.util.*;
import java.io.*;

// Given an array of numbers, find the leaders in it.
// An element is a leader if it is greater than all the elements to its right side.

public class learders {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){     // O(N)
            arr[i] = obj.nextInt();
        }
        int max = arr[n-1];
        int[] suffixMax = new int[n];
        suffixMax[n-1] = -1;

        for(int i=n-2; i>=0; i--){   // O(N)
            suffixMax[i] = max;
            if(arr[i] > max){
                max = arr[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){    // O(N)
            if(arr[i] > suffixMax[i]){
                ans.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}

// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(n)
