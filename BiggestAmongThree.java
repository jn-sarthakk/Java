import java.util.Scanner;

public class BiggestAmongThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter your third number: ");
        int num3 = sc.nextInt();
        sc.close();
        
        // int max = ((num1>num2 && (num1>num3)?num1:(num2>num3)?num2:num3)));
        // System.out.println("The biggest number is: "+max);

        // System.out.println(Math.max(num1,num2,num3));
        
        System.out.println(Math.max(Math.max(num1,num2),num3));
        
    }
}
