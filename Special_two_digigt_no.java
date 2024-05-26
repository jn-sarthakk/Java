import java.util.Scanner;
public class Special_two_digigt_no {
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int n1= a%10;
        int n2= a/10;
        int res = (n1*n2) + (n1+n2);

        sc.close();

        if (res == a){
            System.out.println( a + "is a special two digit number");
        }
        else {
            System.out.println(a + " is not a Special two digit number");
        }
    }
}
