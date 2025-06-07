import java.util.Scanner;

/*
 n= 4
   1   2   3   4
  12  13  14   5
  11  16  15   6
  10   9   8   7
 * 
 */
public class SpiralPattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(); 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", getSpiralValue(i, j, n));
            }
            System.out.println();
        }
    }

    static int getSpiralValue(int i, int j, int n) {
        int layer = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
        int len = n - 2 * layer;
        int startVal = (n * n) - (len * len) + 1;

        if (i == layer) {
            return startVal + (j - layer); // Top row (left to right)
        } 
        if (j == n - layer - 1) {
            return startVal + (len - 1) + (i - layer); // Right column (top to bottom)
        }
        if (i == n - layer - 1) {
            return startVal + 2 * (len - 1) + (n - layer - 1 - j); // Bottom row (right to left)
        }
        if (j == layer) {
            return startVal + 3 * (len - 1) + (n - layer - 1 - i); // Left column (bottom to top)
        }
        return 0; // Center cell will be handled by further recursive layers
    }
}
