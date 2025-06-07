package billing;
import java.util.*;

public class bill {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String text = "Welcome to Laksh FreshMart!";
        int consoleWidth = 70;
        int padding = (consoleWidth - text.length()) / 2;

        System.out.printf("\n%" + (padding + text.length()) + "s%n", text);
         System.out.println("-------------------------------------------------------------------------");

        System.out.println("Our Products...");

        for (products product : products.values()) {
            System.out.println(product.name() + " - Rs." + product.getPrice());
        }

        System.out.print("\nEnter the number of items: ");
        int n = obj.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            System.exit(0);
        }

        double total = 0;
        for(int i=0; i<n; i++){
            try{
                System.out.print("\nProduct "+(i+1)+" name: ");
                obj.nextLine();
                String productName = obj.nextLine().trim();
                System.out.print("Product "+(i+1)+" quantity: ");
                int quantity = obj.nextInt();
                if(quantity<=0){
                    throw new IllegalArgumentException("Quantity must be at least 1");
                }
                products product = products.valueOf(productName.toUpperCase());
                total += product.getPrice() * quantity;  
            }
            catch(Exception e){
                System.out.println("\nInvalid Input: " + (
                    e.getMessage().contains("billing.products.") ?
                    "Please enter a valid product from the list." :
                    e.getMessage()
                ));

                System.out.println("Do you want to continue?? (Y/N)");
                String choice = obj.next();
                if(choice.equals("Y") || choice.equals("y")){
                    i--;
                    continue;
                }
                System.exit(0);
            }
        }

        System.out.println("\n\n-------------------------------------------------------------------------");

        if(total > 500) {
            System.out.println("Yahooo! Your purchase amount is greater than Rs.500. Got 5% discount");
            total = total * 0.95;  // 5% discount
        }

        System.out.println("Total amount: Rs"+total);
        total = total*1.12; // 12% gst
        System.out.println("\nAfter applying 12% GST as per our norms, \nYour total amount is: Rs"+String.format("%.2f",total));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nThanks for Choosing Us! Have a nice day!\n");
    }
}
