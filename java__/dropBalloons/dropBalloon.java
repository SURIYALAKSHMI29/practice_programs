package javaapplication3.dropBalloon;
import java.util.*;

// Given a MxN matrix filled with ‘-‘ and you need to drop the balloons in the desired 
// columns starting from the bottom. You need to print the matrix when a new balloon is dropped. 
// You need to continue getting inputs until the box is full or until the user chooses to stop. 

public class dropBalloon {

    static void printMatrix(char[][] mat, int row, int col){
        System.out.println("Contents of the Matrix :");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Row size:");
        int row = obj.nextInt();

        System.out.print("Enter Column size:");
        int col = obj.nextInt();

        char[][] mat = new char[row+1][col+1];

        int[] track = new int[col];

        for(int i=0; i<=row; i++)
            Arrays.fill(mat[i], '-');
        Arrays.fill(track, 2);

        boolean userWish = true;
        printMatrix(mat, row, col);

        while(userWish){
            System.out.print("Enter the column number: ");
            int colNum = obj.nextInt()-1;

            System.out.print("Enter the color of the Balloon: ");
            char color = obj.next().charAt(0);
            
            int rowNum = track[colNum];
            if(rowNum<0){
                System.out.println("Column is fill, try again!");
                continue;
            }

            track[colNum]--;

            mat[rowNum][colNum] = color;
            printMatrix(mat, row, col);

            System.out.print("Do you wish to continue(Y/N): ");
            String ans = obj.next();

            if(!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("yes")){
                userWish = false;
            }
        }
    }
}
