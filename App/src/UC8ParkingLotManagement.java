import java.util.HashMap;
import java.util.Scanner;
public class UC8ParkingLotManagement{
    public static void main(String[] args){
        HashMap<String,Integer> parkingLot=new HashMap<>();
        parkingLot.put("ABC123",101);
        parkingLot.put("XYZ999",102);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vehicle number:");
        String vehicle=sc.nextLine();
        if(parkingLot.containsKey(vehicle)){
            System.out.println("Vehicle already parked at spot "+parkingLot.get(vehicle));
        }else{
            int newSpot=parkingLot.size()+101;
            parkingLot.put(vehicle,newSpot);
            System.out.println("Vehicle parked at spot "+newSpot);
        }
    }
}