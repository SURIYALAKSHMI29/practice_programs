
public class progressions {
    public static void main(String[] args) {
        int n = 4;
        int a = 5;
        int d = 3;
        int pos = 3;

        ap(a,d,n);
        gp(a,d,n);
        apPosition(a,d,n,pos);
        progression(a,d,n,'a');
    }    
    static void ap(int a, int d, int n){
        System.out.println("Arithmetic Progression");
        for(int i=1; i<=n; i++){
            System.out.print(a+" "); 
            a+=d;
        }
    }
    static void gp(int a, int d, int n){
        System.out.println("\nGeometric Progression");
        for(int i=1; i<=n; i++){
            System.out.print(a+" "); 
            a*=d;
        }
    }

    static void apPosition(int a, int d, int n, int pos){
        System.out.println("\nArithmetic Progression value at position "+pos);
        int val = a+(pos-1)*d;
        System.out.println(val);
    }

    // static void gpPosition(int a, int d, int n, int pos){
    //     System.out.println("\nGeometric Progression value at position "+pos);
    //     int val = a+(pos-1)*d;
    //     System.out.println(val);
    // }

    static void progression(int a, int d, int n, char type){
        int diff = 1;
        int value = a;
        int mul =1;
        if(type=='a'){
            diff = d;
            mul = 1;
        }
        else if(type=='g'){
            diff = 0;
            mul = d;
        }
        else{
            System.out.println("Invalid");
        }
        for(int i=1; i<=n; i++){
            System.out.print(value+" "); 
            value = (value+diff)*mul;
        }
    }
}
