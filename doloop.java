import java.util.Scanner;

class doloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            
        } while (num != 0);

        System.out.println("Program ended");
    }
}