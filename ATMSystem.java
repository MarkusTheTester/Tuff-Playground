import java.util.Scanner;
public class ATMSystem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        System.out.println("===== WELCOME TO CDO SAVINGS ATM! =====");
        do {
            System.out.println("Select an option:");
            System.out.println("1 - Check balance");
            System.out.println("2 - Deposit money");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - Exit");
            System.out.println("---------------------");
            System.out.print("Enter choice (1-4): ");
                int option = sc.nextInt();
                while (option > 4 || option < 1) {
                    System.out.println("Invalid option. Please choose between 1 and 4.");
                    System.out.print("Enter choice (1-4): ");
                        option = sc.nextInt();
                }
            float balance = 0f;
            int optionReturn = 0;
            switch (option) {
                case 1:
                    System.out.println("Current balance: ₱" + balance);
                    System.out.println("Proceed back to main menu?");
                    System.out.println("---------------------");
                    System.out.println("1 - Return to main menue");
                    System.out.println("2 - Exit");
                    System.out.println("---------------------");
                    System.out.print("Enter choice (1-2): ");
                        optionReturn = sc.nextInt();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₱");
                        float deposit = sc.nextFloat();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Successfully deposited ₱" + deposit);
                        System.out.println("New balance: ₱" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    System.out.println("Proceed back to main menu?");
                    System.out.println("---------------------");
                    System.out.println("1 - Return to main menue");
                    System.out.println("2 - Exit");
                    System.out.println("---------------------");
                    System.out.print("Enter choice (1-2): ");
                        optionReturn = sc.nextInt();
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₱");
                        float withdrawal = sc.nextFloat();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Successfully withdrew ₱" + withdrawal);
                        System.out.println("Remaining balance: ₱" + balance);
                    } else if (withdrawal > balance) {
                        System.out.println("Transaction failed: Insufficient funds.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    System.out.println("Proceed back to main menu?");
                    System.out.println("---------------------");
                    System.out.println("1 - Return to main menue");
                    System.out.println("2 - Exit");
                    System.out.println("---------------------");
                    System.out.print("Enter choice (1-2): ");
                        optionReturn = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us. We hope to see you again! 😘❤️");
                    isRunning = false;
                    break;
            }
            switch (optionReturn) {
                case 1:
                    isRunning = true;
                    break;
                case 2:
                    System.out.println("Thank you for banking with us. We hope to see you again! 😘❤️");
                    isRunning = false;
                    break;
                default:
                    while (optionReturn > 2 || optionReturn < 1) {
                        System.out.println("Invalid option. Please choose between 1 and 2.");
                        System.out.print("Enter choice (1-2): ");
                            optionReturn = sc.nextInt();
                    }
            }
        } while (isRunning);
        sc.close();
    }
}