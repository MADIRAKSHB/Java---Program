import java.util.Random;

class randomdemo {
    public static void main(String[] args) {

        Random r = new Random();

        // 1. Student ID
        System.out.println("Student ID: " + r.nextInt(1000));

        // 2. Marks
        System.out.println("Marks: " + (r.nextDouble() * 100));

        // 3. Attendance
        System.out.println("Attendance: " + (r.nextFloat() * 100));

        // 4. Status
        if(r.nextBoolean())
            System.out.println("Status: Pass");
        else
            System.out.println("Status: Fail");

        // 5. Registration Number
        System.out.println("Reg No: " + r.nextLong());

        // 6. Performance Score
        System.out.println("Score: " + (r.nextGaussian() * 10));

        // 7. Random Bytes
        byte[] b = new byte[5];
        r.nextBytes(b);
        System.out.print("Bytes: ");
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        // 8. 5 Random Numbers (simple loop)
        System.out.print("\nRandom Numbers: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(r.nextInt() + " ");
        }
    }
}