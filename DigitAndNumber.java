import java.util.Scanner;

public class DigitAndNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        // int res = num/10;
        // if(res>=1){
        //     System.out.println(num + " is a number");
        // }
        // else{
        //     System.out.println(num + "is a digit");
        // }

        System.out.println((num%10 <=10 && num<10)?num+" is a number": num+" is a digit");    
    }
    
}


// Self made java program in my entire life, i am so happy that i can't explain 
// Today is 14th of May, 2024 and time is 3:09 am.
