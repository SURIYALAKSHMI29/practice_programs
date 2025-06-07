import java.util.*;

// 1 
// 2 14 
// 3 15 25 
// 4 16 26 34 
// 5 17 27 35 41 
// 6 18 28 36 42 46 
// 7 19 29 37 43 47 49 
// 8 20 30 38 44 48 
// 9 21 31 39 45 
// 10 22 32 40 
// 11 23 33 
// 12 24 
// 13 
public class pattern19{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = 13;//obj.nextInt();

        for(int i=0; i<n; i++){
            int val = i+1;
            int diff = n-1;
            int colLimit = Math.min(i+1, (n-i));
            for(int j=0; j<colLimit; j++){
                System.out.print(val+" ");
                val+=diff;
                diff-=2;
            }
            System.out.println();
        }
    }
}
        