import java.util.Scanner;
public class ECommerceCheckout {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price of Item: ₱");
            float itemPrice = sc.nextFloat();
        System.out.print("Enter Quantity of Item/s: ");
            int quantity = sc.nextInt();
            float subtotal = itemPrice * quantity;
            float total = subtotal;
        System.out.print("Is the customer a VIP? (true/false): ");
            boolean isVIP = sc.nextBoolean();
            float discount = 0.10f;
            boolean hasDiscount = (subtotal >= 1000) || isVIP;
                if(hasDiscount){
                    float discountAmount = subtotal * discount;
                    total -= discountAmount; 
                }
        System.out.print("Enter Distance of Delivery (km): ");
            float distanceKm = sc.nextFloat();
            float shippingFee = 50f;
            boolean hasFreeShipping = (subtotal >= 500) && (distanceKm < 10);
                if(!hasFreeShipping){
                    total += shippingFee;
                }
        System.out.println("===== CHECKOUT SUMMARY =====");
        System.out.println("Subtotal: ₱" + subtotal);
        System.out.println("Discount Applied: " + hasDiscount);
        System.out.println("Free Shipping Applied: " + hasFreeShipping);
        System.out.println("-----------------------------");
        System.out.print("TOTAL: ₱" + total);
        sc.close();
    }
}
