import java.util.Scanner;
    public class table {
        private static int i;

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            sc.close();
            for ( i=1;i<=10;i++){
                int res = num*i;
                System.out.println(num + " * " +i+ " = " +res );
            }
        }
}
