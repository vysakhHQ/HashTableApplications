import java.util.HashMap;
public class UC9TwoSumTransactions{
    public static void main(String[] args){
        int[] transactions={500,300,200,700};
        int target=500;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int amount:transactions){
            int complement=target-amount;
            if(map.containsKey(complement)){
                System.out.println("Pair Found: "+amount+" + "+complement+" = "+target);
                return;
            }
            map.put(amount,1);
        }
        System.out.println("No pair found");
    }
}