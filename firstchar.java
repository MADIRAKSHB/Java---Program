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
}