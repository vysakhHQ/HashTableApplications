import java.util.HashMap;
public class UC10MultiLevelCacheSystem{
    public static void main(String[] args){
        HashMap<String,String> L1Cache=new HashMap<>();
        HashMap<String,String> L2Cache=new HashMap<>();
        HashMap<String,String> database=new HashMap<>();
        database.put("video1","Movie Data 1");
        database.put("video2","Movie Data 2");
        L2Cache.put("video2","Movie Data 2");
        String request="video1";
        if(L1Cache.containsKey(request)){
            System.out.println("L1 Cache HIT");
            System.out.println(L1Cache.get(request));
        }else if(L2Cache.containsKey(request)){
            System.out.println("L2 Cache HIT");
            String data=L2Cache.get(request);
            L1Cache.put(request,data);
            System.out.println(data);
        }else{
            System.out.println("Database HIT");
            String data=database.get(request);
            L2Cache.put(request,data);
            L1Cache.put(request,data);
            System.out.println(data);
        }
    }
}