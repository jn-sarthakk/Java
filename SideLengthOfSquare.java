// import java.util.Scanner;

// public class SideLengthOfSquare {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter the side length of the square: ");
//     double side = sc.nextDouble();

//     sc.close();

//     double area = side * side;
//     double perimeter = 4 * side; 

//     System.out.println("The area of the square is: " + area);
//     System.out.println("The perimeter of the square is: " + perimeter);
//   }
// }




import java.util.Scanner;

public class SideLengthOfSquare{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int side = sc.nextInt();
    sc.close();
    int area = side * side;
    int perimeter = 4 * side;

    System.out.println("Area of square is " +area+ " and perimeter of square is " + perimeter);
  }
}


// Self made program