import java.util.HashMap;
import java.util.Scanner;
public class UC3DNSCache{
    static class DNSEntry{
        String ip;
        long expiryTime;
        DNSEntry(String ip,long ttl){
            this.ip=ip;
            this.expiryTime=System.currentTimeMillis()+ttl;
        }
    }
    public static void main(String[] args){
        HashMap<String,DNSEntry> cache=new HashMap<>();
        cache.put("google.com",new DNSEntry("172.217.14.206",5000));
        cache.put("youtube.com",new DNSEntry("142.250.190.78",5000));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter domain:");
        String domain=sc.nextLine();
        if(cache.containsKey(domain)){
            DNSEntry entry=cache.get(domain);
            if(System.currentTimeMillis()<entry.expiryTime){
                System.out.println("Cache HIT");
                System.out.println("IP Address: "+entry.ip);
            }else{
                System.out.println("Cache EXPIRED");
            }
        }else{
            System.out.println("Cache MISS");
        }
    }
}