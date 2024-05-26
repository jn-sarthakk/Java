import java.util.Scanner;
public class Average_Method_Calculate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mumber: ");
        float num1 = sc.nextFloat();
        float res = avgCalc(num1);
        System.out.println("Average of both digits are: "+res); // sir i want that ki output line should be like this ("sum of both digits "+res1+" and "+res2+ " are " +res);  but i am not able to access res1 and res2 
    }
    
    public static float avgCalc(float a){
        float res1 = a/2;
        return res1;
    }
}
// and average is showing a little bit above