import java.util.Scanner;
    public class MiddleValue {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 =sc.nextInt();

            System.out.print("Eter secind number: ");
            int num2= sc.nextInt();

            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();
            
            sc.close();
            
            // int middle;

            // if((num1>=num2 && num1<=num3) || (num1<=num2 && num1>=num3)){
            //     middle = num1 ;
            // }
            // else if((num2>=num1 && num2<=num3) || (num2<=num1 && num2>=num3)){
            //     middle = num2;
            // }
            // else{
            //     middle = num3;
            // }
            // System.out.println("The middle value is "+middle);

            System.out.println(Math.max(Math.min(num1, num2),num3));
        }
}


// Sir question 14 doubt. I want to solve this problem with ternary operator and failed to build logic so please help