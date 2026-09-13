public class RideSummary {
    public static void main(String[]args){
        String passenger = "Gwyneth Fernando";
        double baseFare = 40.0;
        double distanceKm = 8.5;
        double ratePerKm = 15.0;
        char driverRating = 'A';
            double totalFare = baseFare + (ratePerKm * distanceKm);
        System.out.println("===== RIDE SUMMARY =====");
        System.out.println("Passenger: " + passenger);
        System.out.println("Trip Distance: " + distanceKm + "km");
        System.out.println("Assigned Driver Grade: " + driverRating);
        System.out.println("----------------------------");
        System.out.println("Estimated total fare: ₱" + totalFare);
    }
}