import java.util.Scanner;
public class FactorialMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int res = fac(num);
        System.out.println("Factorial of "+num+" is " +res);
    }
    public static int fac(int a){
        int fact=1;
        for(int i=1;i<=a; i++){
            fact = fact * i;
        }
        return fact;
}
}



// import java.util.Scanner;
// public class Factorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         int res = fac(num);
//         System.out.println(num + "Factoirarl is "+res);
// }
// }

// public static int fac(int a){
//     int fact=1;
//     for( int i=1;i <=a  ; i++){
//         fact = a * i;
//     }
//     return fact;
// }

// sir we were defining method outside the main class that's it was showing error   