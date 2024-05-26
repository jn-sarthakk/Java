import java.util.Scanner;
public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ebter a number: ");
        int n = sc.nextInt();   
        printDiv(n);
    }
    public static void printDiv(int a){
        for (int i=1; a%i<=0;i++){
            System.out.print(i+" ");
        }
    }
}
//sir its showing only 1234 in a output as if we find the divisor of 10 then only 1,2 are showing and 5 is not showing. and same as in case of 46 only 1 and 2 are showing 13,23 are not showing