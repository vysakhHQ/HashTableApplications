import java.util.HashMap;
import java.util.HashSet;
public class UC5RealTimeAnalyticsDashboard{
    public static void main(String[] args){
        HashMap<String,Integer> pageViews=new HashMap<>();
        HashMap<String,HashSet<String>> uniqueVisitors=new HashMap<>();
        HashMap<String,Integer> trafficSource=new HashMap<>();
        String url="/article/news";
        String userId="user123";
        String source="google";
        pageViews.put(url,pageViews.getOrDefault(url,0)+1);
        uniqueVisitors.putIfAbsent(url,new HashSet<>());
        uniqueVisitors.get(url).add(userId);
        trafficSource.put(source,trafficSource.getOrDefault(source,0)+1);
        System.out.println("Page Views: "+pageViews.get(url));
        System.out.println("Unique Visitors: "+uniqueVisitors.get(url).size());
        System.out.println("Traffic Source Count: "+trafficSource.get(source));
    }
}