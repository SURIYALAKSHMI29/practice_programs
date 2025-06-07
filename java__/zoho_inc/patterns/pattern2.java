import java.util.*;


/*
 n=5     
    1 3 6 10 15
    2 5 9 14 16
    4 8 13 16 18
    7 12 16 19 21
    11 16 20 23 25
 
 */
public class pattern2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        // without extra var
        // System.out.println("Without using extra variable");
       

        System.out.println("\nWith using extra variable");

        int start = 1;
        
        // using 2 for loops is better than using a single for loop with if i=condition inside 

        for(int i=1; i<=n; i++){
            int val = start;
            for(int j=i+1; j<=n; j++){
                System.out.print(String.format("%2d", val)+" ");
                val+= j;
            }
            for(int j= n; j>(n-i); j--){
                System.out.print(String.format("%2d", val)+" ");
                val+= j;
            }
            start+=i;
            System.out.println();
        }

        // for(int i=1; i<=n; i++){
        //     int val = start;
        //     for(int j=0; j<n; j++){
        //         System.out.print(val+" ");
        //         if(j<n-i){
        //             val+=j+i+1;
        //         }
        //         else{
        //             val+=(n-j);
        //         }
        //     }
        //     start+=i;
        //     System.out.println();
        // }
    }
}