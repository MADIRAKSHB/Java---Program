<<<<<<< HEAD
import java.util.*;

class expense {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int choice = 1;

        while (choice == 1) {

            System.out.println("Enter food: ");
            String food = sc.nextLine();

            System.out.println("Enter expense: ");
            int expense = sc.nextInt();
            sc.nextLine(); 

            total = total + expense;

            System.out.println("Enter 1 to continue or 0 to stop:");
            choice = sc.nextInt();
            sc.nextLine(); 
        }

        System.out.println("Total expense = " + total);
    }
=======
import java.util.*;

class expense {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int choice = 1;

        while (choice == 1) {

            System.out.println("Enter food: ");
            String food = sc.nextLine();

            System.out.println("Enter expense: ");
            int expense = sc.nextInt();
            sc.nextLine(); 

            total = total + expense;

            System.out.println("Enter 1 to continue or 0 to stop:");
            choice = sc.nextInt();
            sc.nextLine(); 
        }

        System.out.println("Total expense = " + total);
    }
>>>>>>> 7b2352d8e564348dd534af68226721b4f0b2c784
}