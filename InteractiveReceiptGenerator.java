import java.util.Scanner;
public class InteractiveReceiptGenerator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of Drink: ");
            String itemName = sc.nextLine();
        System.out.print("Enter Amount of Drinks: ");
            int quantity = sc.nextInt();
        System.out.print("Enter Price: ₱");
            float unitPrice = sc.nextFloat();
        System.out.print("Are you a senior citizen or student? (true/false): ");
            boolean hasDiscount = sc.nextBoolean();
            float totalPrice = unitPrice * quantity;
        System.out.println("===== ORDER RECEIPT =====");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Unit: ₱" + unitPrice);
        System.out.println("Discount Applied: " + hasDiscount);
        System.out.println("------------------------");
        System.out.println("Total Amount Due: ₱" + totalPrice);
        System.out.print("===== ALERT: Applying discount is still a work in progress! =====");
        sc.close();
    }
}