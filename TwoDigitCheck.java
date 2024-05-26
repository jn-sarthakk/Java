import java.util.Scanner;
    public class TwoDigitCheck {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n1= sc.nextInt();
            sc.close();
            
            System.out.println((n1>10) || (n1==10)? "The number is two digit number" : "The number is single digiit number");
        }
}
// System.out.println((n1%10   && )? "The number is a two digit number" : "The number is a single digit number");