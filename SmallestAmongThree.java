import java.util.Scanner;

public class SmallestAmongThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter your third number: ");
        int num3 = sc.nextInt();
        sc.close();

        // int min = ((num1<num2) && (num1<num3)?num1:(num2<num3)?num2:num3);
        // System.out.println("The smallest number is: "+max);

        System.out.println(Math.min(Math.min(num1, num2), num3));
    }
}
