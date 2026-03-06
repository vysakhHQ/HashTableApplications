import java.util.HashMap;
public class UC6APIRateLimiter{
    public static void main(String[] args){
        HashMap<String,Integer> requestCount=new HashMap<>();
        int limit=5;
        String clientId="client123";
        for(int i=1;i<=7;i++){
            requestCount.put(clientId,requestCount.getOrDefault(clientId,0)+1);
            if(requestCount.get(clientId)<=limit){
                System.out.println("Request "+i+" Allowed");
            }else{
                System.out.println("Request "+i+" Denied (Rate limit exceeded)");
            }
        }
    }
}