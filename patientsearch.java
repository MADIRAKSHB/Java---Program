import java.util.*;

class patientsearch {
    public static void main(String[] args) {

        int[] patient = {101, 102, 103, 104, 105};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        for(int i = 0; i < patient.length; i++) {
            if(patient[i] == id) {
                System.out.println("Found");
                return; // stop program if found
            }
        }

        System.out.println("Not Found");
    }
}