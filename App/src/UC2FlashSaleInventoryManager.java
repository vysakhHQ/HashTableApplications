import java.util.HashMap;
import java.util.Scanner;
public class UC2FlashSaleInventoryManager{
    public static void main(String[] args){
        HashMap<String,Integer> inventory=new HashMap<>();
        inventory.put("IPHONE15",5);
        inventory.put("SAMSUNG_S24",3);
        inventory.put("PIXEL8",2);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product name:");
        String product=sc.nextLine();
        if(inventory.containsKey(product)){
            int stock=inventory.get(product);
            if(stock>0){
                inventory.put(product,stock-1);
                System.out.println("Purchase successful");
                System.out.println("Remaining stock: "+(stock-1));
            }else{
                System.out.println("Out of stock");
            }
        }else{
            System.out.println("Product not found");
        }
    }
}