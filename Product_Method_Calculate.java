import java.util.Scanner;
public class Product_Method_Calculate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mumber: ");
        int num1 = sc.nextInt();
        int res = sumCalc(num1);
        System.out.println("Sum of both digits are: "+res); // sir i want that ki output line should be like this ("sum of both digits "+res1+" and "+res2+ " are " +res);  but i am not able to access res1 and res2 
    }
    
    public static int sumCalc(int a){
        int res1 = a%10;
        int res2 = a/10;
        int res3 = res1 * res2;
        return res3;
    }
}