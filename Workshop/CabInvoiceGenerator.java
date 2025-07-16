package LocalRepo.Workshop;

import java.util.*;
public class CabInvoiceGenerator {
     int distance;
     int time;
      double MinimumFare = 5.0;
         double CostPerKm = 10.0;
        double CostPerMin = 1.0;
        
        CabInvoiceGenerator(int distance, int time) {
            this.distance = distance;
            this.time = time;
          
        }

    public double calculateFare(String rideType) {
        if (rideType.equals("premium")) {
            CostPerKm = 15.0;
            CostPerMin = 2.0;
        } else if (rideType.equals("normal")) {
            CostPerKm = 10.0;
            CostPerMin = 1.0;
        } else {
            System.out.println("Invalid ride type. Defaulting to normal.");
        }
        

       double fare = (distance * CostPerKm) + (time * CostPerMin);
        return Math.max(fare, MinimumFare);
    }
    public double totalFare(List<Integer> rides) {
        double totalFare = 0;
        for (int ride : rides) {
            totalFare += ride;
        }
        return totalFare;
    }
    public static void main (String [] args){
       CabInvoiceGenerator cabInvoice =new CabInvoiceGenerator(10,15);
        

        List<Integer> rides=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rides:");
        int numberOfRides = sc.nextInt();
        for(int i=0;i<numberOfRides;i++){

            System.out.println("Enter distance and time for ride and rideType " + (i + 1) + ":");
            int distance = sc.nextInt();
            int time = sc.nextInt();
            String rideType = sc.next();
            CabInvoiceGenerator ride = new CabInvoiceGenerator(distance, time);
            rides.add((int) ride.calculateFare(rideType));
        }
        double totalFare = cabInvoice.totalFare(rides);
          System.out.println("Total no. of rides: " + rides.size());
            System.out.println("Total Average of all rides " + totalFare/rides.size());
        System.out.println("Total fare for all rides is: " + totalFare);

    }
    
}
