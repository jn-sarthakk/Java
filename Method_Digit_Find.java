import java.util.Scanner;
    public class Method_Digit_Find{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.close();
            int res=digitCheck(num);
            System.out.println(res);
    }
    public static int digitCheck(int a){
        int count = 0;
        while(a!=0){
           
            count++;
            a = a/10;
        }
        return count;
    }
}

// sir if i am not writing return a, it is showing error