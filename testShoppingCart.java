import java.util.Scanner;
//hello world
public class testShoppingCart {
    //Main method...
    public static void main(String [] args) {
        //create Scanner object
        Scanner in = new Scanner(System.in);
        ShoppingCart obj = new ShoppingCart();
        
        while(true) {
            //enter item
            System.out.print("Enter the name of the item : ");
            String item;
            item = in.next();
            
            obj.addToCart(item);
            //remove item?
            System.out.print("Any item to remove from cart? y/n ");
            
            char yn = in.next().charAt(0);
            
            if(yn == 'y') {
                //enter item to be removed
                System.out.print("Enter item to remove from cart : ");
                String item1;
                item1 = in.next();
                obj.DropFromCart(item1);
                obj.getItems();
                //Continue shopping or not?
                System.out.println("Continue Shopping? : y/n ");
                char yn2 = in.next().charAt(0);
                if(yn2 == 'y') {
                    continue;
                }
                else if(yn2 == 'n') {
                    //display total items
                    System.out.println("Total items shopped : "+obj.getNoOfItems());
                    System.out.print("Thank You, Please shop again!!!");
                    break;
                }
            }
            else if (yn == 'n') {
                obj.getItems();
                System.out.print("Continue Shopping? : y/n ");
                char yn3 = in.next().charAt(0);
                if(yn3 == 'y') {
                    continue;
                }
                else if(yn3 == 'n') {
                    //total number of items shopped
                    System.out.println("Total items shopped : "+obj.getNoOfItems());
                    System.out.print("Thank You, Please shop again!!!");
                    break;
                }
            }
            else {
                continue;
            }
            
        }
    }
}


