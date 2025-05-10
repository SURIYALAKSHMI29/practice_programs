package javaapplication3;
import java.util.*;
import java.io.*;

// traverse the matrix in snake pattern

public class snake_traversal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int n = matrix.length, m = matrix[0].length;

        boolean leftToRight = true;

        for(int i=0; i<n; i++){
           // if(i%2 == 0){
            if(leftToRight){
                for(int j=0; j<m; j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            else{
                for(int j=m-1; j>=0; j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            leftToRight = !leftToRight;

            System.out.println();
        }
    }
}

// Time Complexity: O(n * m)
// Space Complexity: O(1)
