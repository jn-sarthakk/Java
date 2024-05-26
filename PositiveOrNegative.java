import java.util.Scanner;
    public class PositiveOrNegative {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            sc.close();
            
            System.out.println((num>0)|| (num==0)? "Positive" : "Negative");
        }
}
