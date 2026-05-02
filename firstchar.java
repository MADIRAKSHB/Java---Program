<<<<<<< HEAD
import java.util.Scanner;

class firstchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() > 0) {
            System.out.println(str.charAt(0));
        } else {
            System.out.println("Empty string");
        }
    }
=======
import java.util.Scanner;

class firstchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() > 0) {
            System.out.println(str.charAt(0));
        } else {
            System.out.println("Empty string");
        }
    }
>>>>>>> 7b2352d8e564348dd534af68226721b4f0b2c784
}