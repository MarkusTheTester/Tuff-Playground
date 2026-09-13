import java.util.Scanner;
public class CinemaTicketSystem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of ticket: ₱");
            float basePrice = sc.nextFloat();
            float finalPrice = basePrice;
        System.out.print("Enter customer age: ");
            int age = sc.nextInt();
                while(age < 0){
                    System.out.print("son you haven't been born yet 😒🥀 enter your REAL age: ");
                    age = sc.nextInt();
                }
            float discountAge = .20f;
            boolean isChild = age <= 12;
            boolean isSeniorCitizen = age >= 60;
            boolean hasDiscountAge = isChild || isSeniorCitizen;
                if (hasDiscountAge){
                    finalPrice -= basePrice * discountAge;
                }
        System.out.print("Enter day of booking (From 1 to 7; 1 = Monday, 2 = Tuesday, etc.): ");    
            int day = sc.nextInt();
                while(day > 7 || day < 1){
                    System.out.print("ONLY choose from Days 1 to 7!: ");
                    day = sc.nextInt();
                }
            boolean isWeekend = day > 5;
            float feeWeekend = 50f;
            String dayBooked = "";
                switch (day){
                    case 1:
                        dayBooked = "Monday";
                        break;
                    case 2:
                        dayBooked = "Tuesday";
                        break;
                    case 3:
                        dayBooked = "Wednesday";
                        break;
                    case 4:
                        dayBooked = "Thursday";
                        break;
                    case 5:
                        dayBooked = "Friday";
                        break;
                    case 6:
                        dayBooked = "Saturday";
                        break;
                    case 7:
                        dayBooked = "Sunday";
                        break;
                }   
        System.out.print("Is the customer a student? (true/false): ");
            boolean isStudent = sc.nextBoolean();
            float discountStudent = .15f;
            boolean hasDiscountStudent = isStudent && !isWeekend;
                if (hasDiscountStudent){
                    finalPrice -= basePrice * discountStudent;
                } else if (isWeekend){
                    finalPrice += feeWeekend;
                }
        System.out.println("===== TICKET SUMMARY =====");
        System.out.println("Base Price: ₱" + basePrice);
        System.out.println("Day Booked: " + dayBooked);
        System.out.println("Child/Senior Citizen Discount Applied: " + hasDiscountAge);
        System.out.println("Student Discount Applied: " + hasDiscountStudent);
        System.out.println("Weekend Fee Applied: " + isWeekend);
        System.out.println("-----------------------------------");
        System.out.print("TOTAL: ₱" + finalPrice);
        sc.close();
    }
}