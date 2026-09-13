import java.util.Scanner;
public class CloudStoragePlanSelector {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Subscription Tier List:");
        System.out.println("------------------------------");
        System.out.println("1 - Basic (₱99)");
        System.out.println("2 - Professional (₱299)");
        System.out.println("3 - Enterprise (₱499)");
        System.out.println("------------------------------");
        System.out.print("Enter choice (1-3): ");
            int tierChoice = sc.nextInt();
                while(tierChoice > 3 || tierChoice < 1){
                    System.out.print("Invalid tier selected. Please choose from 1-3 ONLY: ");
                    tierChoice = sc.nextInt();
                } 
            String tierName = "";
            float monthlyFee = 0.0f;
                switch (tierChoice){
                    case 1:
                        tierName = "Basic";
                        monthlyFee = 99f;
                        break;
                    case 2:
                        tierName = "Professional";
                        monthlyFee = 299f;
                        break;
                    case 3:
                        tierName = "Enterprise";
                        monthlyFee = 499f;
                        break; 
                }   
        System.out.print("Enter current cloud storage (GB): ");
            float gbStorage = sc.nextFloat();
        System.out.println("Paying via annual upfron billing? (true/false)");
        System.out.print("(P.S: You can get a 10% discount on annual payment!): ");
            boolean isAnnualBilling = sc.nextBoolean();
            boolean hasFreeBonusStorage = (tierChoice > 1 && isAnnualBilling) || (tierChoice == 1 && gbStorage < 5);
            String paymentMode = "";
            float totalPrice = monthlyFee;
            float annualDiscount = 0.10f;
                if (isAnnualBilling){
                    paymentMode = "Annual";
                    totalPrice *= 12;
                    totalPrice -= totalPrice * annualDiscount;
                } else
                    paymentMode = "Monthly";
        System.out.println("===== SUBSCRIPTION SUMMARY =====");
        System.out.println("Subscription Tier: " + tierName);
        System.out.println("Mode of Payment: " + paymentMode);
        System.out.println("Eligible for Free Bonus Storage: " + hasFreeBonusStorage);
        System.out.println("--------------------------------");
        System.out.print("TOTAL: ₱" + totalPrice);
        sc.close();
    }
}
