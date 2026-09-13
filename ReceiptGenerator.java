public class ReceiptGenerator {
    public static void main(String[]args){
        String itemName = "Iced Caramel Macchiato";
        int quantity = 2;
        float unitPrice = 150.00f;
        boolean hasDiscount = false;
            float totalPrice = unitPrice * quantity;
        System.out.println("===== ORDER RECEIPT =====");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Unit: ₱" + unitPrice);
        System.out.println("Discount Applied: " + hasDiscount);
        System.out.println("------------------------");
        System.out.print("Total Amount Due: ₱" + totalPrice);
    }
}