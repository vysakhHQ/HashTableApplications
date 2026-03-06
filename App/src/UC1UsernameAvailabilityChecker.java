import java.util.HashMap;
import java.util.Scanner;
public class UC1UsernameAvailabilityChecker{
    public static void main(String[] args){
        HashMap<String,Integer> usernames=new HashMap<>();
        usernames.put("john_doe",1);
        usernames.put("alice",2);
        usernames.put("admin",3);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username:");
        String username=sc.nextLine();
        if(usernames.containsKey(username)){
            System.out.println("Username already taken");
        }else{
            System.out.println("Username available");
        }
    }
}
