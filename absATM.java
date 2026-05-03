
import java.util.Scanner;

class absATM {
    public static void main(String[] args) {
        int pin = 1234;
        Scanner sc = new Scanner(System.in);
        balance b = new balance();

        System.out.print("Enter your PIN: ");
        int inputPin = sc.nextInt();

        if (inputPin == pin) {
            System.out.println("PIN is correct. Proceed with your transaction!");
            System.out.println("Choose an option:");
            System.out.println("1. Deposit amount");
            System.out.println("2. Check balance");

            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter the amount to deposit: ");
                int amount = sc.nextInt();
                b.deposit(amount);
                System.out.println("Deposit successful. New balance: " + b.getBalance());
            } 
            else if (choice == 2) {
                System.out.println("Current balance: " + b.getBalance());
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
         else {
            System.out.println("Incorrect PIN. Please try again.");
        }

        
    }
}

class balance {
    private int balance = 1000;

    int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        balance += amount;
    }
}
