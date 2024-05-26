import java.util.Scanner;
    public class DateValid {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number between 1-31:");
            int dd = sc.nextInt();
             
            System.out.print("Enter month number: ");
            int mm = sc.nextInt();

            System.out.print("Enter year number: ");
            int yy = sc.nextInt();

            if (dd<1 || dd>31 || mm<1 || mm>12 || yy<1){
                System.out.println("Invalid Date");
            }
            else if ((mm==4 || mm==6 || mm==11) && (dd>30)){
                System.out.println("user enter" +dd+ "-"+mm+"-"+yy+"is invalid");
            }
            else if (mm==2 && dd>29){
                System.out.println("user enter" +dd+ "-"+mm+"-"+yy+"is invalid");
            }
            else if ((yy%4==0 && yy%100!=0 ||yy%400 ==0) ==false && (mm==2&&dd>28)){
                System.out.println("user enter" +dd+ "-"+mm+"-"+yy+"is invalid");
            }
            else {  
                System.out.println("Date" + dd+ "-" +mm+"-" +yy +"is valid") ;

            }
            // System.out.println((date<31 && date >=1)? "Valid date": "Invalid date");
        }
    
}
