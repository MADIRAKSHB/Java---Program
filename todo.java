import java.util.*;

 class todo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your task:");
        String task = sc.nextLine();
        todo1 t = new todo1();
        t.mn(task);
    }
}
class todo1{
void mn(String b){
    if(b.isBlank()){

<<<<<<< HEAD
        System.out.println("String is empty");
=======
        System.out.println("Enter your task: ");
>>>>>>> 7b2352d8e564348dd534af68226721b4f0b2c784
        return;
    }
    else{
        System.out.println("Your task is: "+b);
        System.out.println("Thank you for entering");
<<<<<<< HEAD
}
=======
    }
>>>>>>> 7b2352d8e564348dd534af68226721b4f0b2c784
}

}