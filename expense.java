import java.util.*;

class expense {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int expensive;
       int total =0;
        do {      
        System.out.println("Enter your food: ");
        String food=sc.nextLine();
        if(food.isBlank()){
            break;
        }
        System.out.println("Enter your expensive:");
        expensive=sc.nextInt();
        sc.nextLine(); 
        if(expensive!=0){
             System.out.println("Your food is: "+food);
             System.out.println("Your expensive is: "+expensive);
            total +=expensive;
        System.out.println("Total:"+total);
        }

        }while(expensive != 0);

    }
}

