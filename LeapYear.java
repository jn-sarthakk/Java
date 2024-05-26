import java.util.Scanner;
    public class LeapYear {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = sc.nextInt();
            sc.close();
            
            System.out.println((year%4 == 0 && year%400==0)?"Leap Year" : "Not a Leap Year");
        }
}
