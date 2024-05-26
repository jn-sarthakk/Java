import java.util.Arrays;
import java.util.Scanner;
    public class MonthDays {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number between 1-12: ");
            int num = sc.nextInt();
            System.out.print("Enter a year : ");
            int year = sc.nextInt();

            sc.close();

            // int[] month1={1,3,5,7,8,10,12};
            // int[] month2={4,6,9,11};
            // int[] month3={2};
            if (num==1||num==3||num==5||num==7||num==8||num==10||num==12){
                System.out.println("31 days");
            }
            else if(num==4||num==6||num==9||num==11){
                System.out.println("30 days");
            }
            else if (num==2){
                if (year%4==0) {
                    System.out.println("29");
                }
                else{
                    System.out.println("28 days");
                }
            }
            else {
                System.out.println("Enter number between 1-12");
            }
        }
}

//resolve this error sir
//resolved by me 