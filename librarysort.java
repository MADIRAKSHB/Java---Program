import java.util.*;

class librarysort {
    public static void main(String[] args) {

        int[] book = {105, 101, 104, 102, 103};

        Arrays.sort(book); 

        for(int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }
}