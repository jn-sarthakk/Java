import java.util.Scanner;
    public class reverseN_NumbersPrint {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();


            while (n>0){
                System.out.print(n+"\t");
                n--;
            }
        }
}