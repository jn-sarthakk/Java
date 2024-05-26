import java.util.Scanner;
    public class PositiveFormat{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt(); 
            sc.close();
            if(num<0){
                System.out.print(num*-1);
            }
            else{
                System.out.print(num);            
            }
        }
    }