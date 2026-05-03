import java.util.Random;

class draw {
    public static void main(String[] args) {
        String[] names = {"Arun", "Bala", "Cathy", "Divya", "Eshan"};
        Random r = new Random();
        int index = r.nextInt(names.length);
        System.out.println("Winner is: " + names[index]);
    }
}