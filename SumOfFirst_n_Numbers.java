import java.util.Scanner;

public class SumOfFirst_n_Numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    sc.close();
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum = sum + i;
    }
    System.out.println("The sum of first n natural numbers is : " +sum);
  }
}
