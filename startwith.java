import java.util.Scanner;

class Startwith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.startsWith("Java")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}