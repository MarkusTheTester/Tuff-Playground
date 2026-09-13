import java.util.Scanner;
public class RideSurgeRateEvaluator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Fare: ₱");
            float baseFare = sc.nextFloat();
        System.out.print("Enter Fare Per Km: ₱");
            float ratePerKm = sc.nextFloat();
        System.out.print("Enter Trip Distance (km): ");
            float distanceKm = sc.nextFloat();
            float fare = baseFare + (distanceKm * ratePerKm);
        System.out.print("Is it peak traffic hour? (true/false): ");
            boolean isPeakHour = sc.nextBoolean();
        System.out.print("Is it raining? (true/false): ");
            boolean isRaining = sc.nextBoolean();
            float surgeRate = 1.5f;
            boolean isSurgeActive = isPeakHour && isRaining;
                if(isSurgeActive){
                    fare *= surgeRate;
                }
        System.out.print("Enter driver's star rating (1.0 to 5.0): ");
            float driverRating = sc.nextFloat();
                while(driverRating > 5 || driverRating < 1){
                    System.out.print("Enter driver's star rating (ONLY 1.0 to 5.0!): ");
                    driverRating = sc.nextFloat();
                }
            boolean hasDriverBonus = (driverRating >= 4.5) && (distanceKm > 5);
        System.out.println("===== RIDE SUMMARY =====");
        System.out.println("Trip Distance: " + distanceKm + "km");
        System.out.println("Assigned Driver Rating: " + driverRating + " stars");
        System.out.println("Surge Rate Applied: " + isSurgeActive);
        System.out.println("Driver Eligible for Bonus: " + hasDriverBonus);
        System.out.println("----------------------------");
        System.out.print("Estimated Total Fare: ₱" + fare);
        sc.close();
    }
}
