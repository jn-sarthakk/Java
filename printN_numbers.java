import java.util.Scanner;
    public class printN_numbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            for ( int i=1; i<=n; i++)
            {
                System.out.print(i+"\t");
            }
        }   
    }