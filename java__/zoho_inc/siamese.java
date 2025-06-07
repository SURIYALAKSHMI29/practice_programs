import java.util.*;
public class siamese {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt(); 
        int[][] magic = new int[n][n];

        int number = 1;
        int i = 0, j = n / 2; 

        while (number <= n * n) {
            magic[i][j] = number++;

            int newI = (i - 1 + n) % n; 
            int newJ = (j + 1) % n;    

            if (magic[newI][newJ] != 0) {
                i = (i + 1) % n;
            } else {
                i = newI;
                j = newJ;
            }
        }
        
        for (int[] row : magic) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
