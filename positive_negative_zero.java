import java.util.Scanner;
    public class positive_negative_zero {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.close();
            
            System.out.println((num>1)? "Positive Number" : ((num<1) && (num!=0))? "Negative Number" : "Zero");

        }
}
