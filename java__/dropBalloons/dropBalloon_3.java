package javaapplication3.dropBalloon;
import java.util.*;

// Extended version of the previous problem. If any column has three continuous balloons 
// of same colors then we need to burst them. 

public class dropBalloon_3 {
    static void printMatrix(char[][] mat, int row, int col){
        System.out.println("\nContents of the Matrix :");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Row size:");
        int row = obj.nextInt();

        System.out.print("Enter Column size:");
        int col = obj.nextInt();

        char[][] mat = new char[row+1][col+1];

        int[] track = new int[col];

        int currRow = row-1;

        for(int i=0; i<=row; i++)
            Arrays.fill(mat[i], '-');
        Arrays.fill(track, row);

        boolean userWish = true;
        printMatrix(mat, row, col);

        int matchLen = 3;

        while(userWish){
            System.out.print("Enter the column number: ");
            int colNum = obj.nextInt()-1;

            System.out.print("Enter the color of the Balloon: ");
            char color = obj.next().charAt(0);
            
            int rowNum = track[colNum] - 1;

            if(rowNum<currRow){
                boolean avail = false;

                for(int i=0; i<col; i++){
                    if(mat[currRow][i]=='-'){
                        avail = true;
                        colNum = i;
                        rowNum = currRow;
                        break;
                    }
                }

                if(!avail){
                    currRow--;
                }
            }

            track[colNum]--;
            mat[rowNum][colNum] = color;

            if(rowNum+matchLen<=row){
                boolean colBurst = true;
                for(int i=rowNum; i<rowNum+matchLen; i++){
                    if(mat[i][colNum]=='-' || mat[i][colNum]!=color){
                        colBurst = false;
                        break;
                    }
                }
                if(colBurst){
                    for(int i=rowNum; i<rowNum+matchLen; i++){
                        mat[i][colNum] = '-';
                        track[colNum]++;
                    }
                    System.out.println("\nBALLOONS BURSTED at the column number "+(colNum+1)+"!");
                }
            }
            
            printMatrix(mat, row, col);

            if(track[colNum]<=0){
                System.out.println("Column is filled completely. Program is terminated.");
                break;
            }

            if(currRow<0){
                System.out.println("Row is filled completely. Program is terminated.");
                break;
            }

            System.out.print("Do you wish to continue(Y/N): ");
            String ans = obj.next();

            if(!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("yes")){
                System.out.println("Program is terminated.");
                userWish = false;
            }
        }
    }
}