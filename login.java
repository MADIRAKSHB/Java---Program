import java.util.Scanner;

class login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        user obj = new user();

        if(u.equals(obj.getUsername()) && p.equals(obj.getPassword())) {
            System.out.println("Login successful! Welcome " + u);
        } else {
            System.out.println("Login failed!");
        }
    }
}

class user {
    private String username = "MATHI";
    private String password = "Password@123";

    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }
}