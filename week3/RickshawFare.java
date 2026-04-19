import java.util.Scanner;
public class RickshawFare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int Basefare = 50;
        int PerKm= 20;
        int PerMinute = 2;
        System.out.println("Enter Distance(km): ");
        double distance = sc.nextDouble();
        
        System.out.println("Enter Travel Time(Minute): ");
        int time = sc.nextInt();
        
        System.out.println("Is the customer local? (True/False): ");
        boolean isLocal = sc.nextBoolean();
        
        System.out.println("Is it night travel? (True/False): ");
        boolean isNight = sc.nextBoolean();
        
        Double fare = Basefare + (distance*PerKm) + (time*PerMinute);
        Double discount = (isLocal && distance >=10) ? fare*0.10 : 0;
        
        int surcharge = isNight ? 50 : 0;
        Double totalfare = fare - discount + surcharge ;
        
        System.out.println("\n");
        System.out.println("total fare: Rs." + totalfare);
        
        sc.close();
    }
}
