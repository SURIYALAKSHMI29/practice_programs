import java.util.*;
/* 
n= 5

1 3 5 7 9 
2 4 6 8 10 
11 13 15 17 19 
12 14 16 18 20 
21 23 25 27 29 

*/
public class pattern12 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int odd = 1;
        int even = 2;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2!=0){
                    System.out.print(odd+" ");
                    odd+=2;
                }
                else{
                    System.out.print(even+" ");
                    even+=2;
                }
            }
            System.out.println();
        }
    }
}
