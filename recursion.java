import java.util.Scanner;
public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = recurse(num);
        System.out.println("Recursion value is : "+result);
    }
    public static int recurse(int a) {      // here a will be valid entered by user and stored in num
        if (a > 0) {
            return a + recurse(a - 1);
        } else {
            return 0;
        }
    }
}
