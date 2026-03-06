import java.util.HashMap;
import java.util.Scanner;
public class UC7AutocompleteSystem{
    public static void main(String[] args){
        HashMap<String,Integer> queries=new HashMap<>();
        queries.put("java",100);
        queries.put("javascript",80);
        queries.put("java tutorial",60);
        queries.put("python",90);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter search prefix:");
        String prefix=sc.nextLine();
        System.out.println("Suggestions:");
        for(String query:queries.keySet()){
            if(query.startsWith(prefix)){
                System.out.println(query);
            }
        }
    }
}