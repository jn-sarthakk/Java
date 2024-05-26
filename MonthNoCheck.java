import java.util.Scanner;

public class MonthNoCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number between 1-12: ");
        int num = sc.nextInt();
        sc.close();
        if(num<=12){
            System.out.println(num + " is a valid month number");
        }
        else{
            System.out.println(num+ " is not a valid month number");
            System.out.println("Please enter a valid month number");
        }
    }
}

// One more code by myself without interacting with ai 
// Feeling overwhelmed 