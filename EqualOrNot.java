import java.util.Scanner;
    public class EqualOrNot {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number");
            int num2 = sc.nextInt();
            sc.close();
            
            System.out.println((num1==num2)? "Both are equal" : "Both are not  equal");
        }
}
