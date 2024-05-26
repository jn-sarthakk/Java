import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number : ");
        float num2 = sc.nextFloat();

        System.out.println("Select any one option from the following:");
        System.out.println("1. Addition   2. Substraction   3. Multiplication   4. Division");

        float sum = num1 + num2;
        float sub = num1 - num2;
        float mul = num1 * num2;
        float div = num1 / num2;

        int choice = sc.nextInt();
        sc.close();
        if (choice == 1){
            System.out.println("Sum of two numbers is : "+sum);
        }
            else if(choice==2){
                System.out.println("Difference between two numbers is : "+sub);
            }
            else if(choice==3){
                System.out.println("Multiplication of two numbers is : "+mul);
            }
            else if(choice==4){
                System.out.println("Division of two numbers is : "+div);
            }
        else {
            System.out.println("Invalid Choice. Please enter numbers between 1-4");
        }    
    }
        
        
        // switch (choice){
        //     case 1:
        //         System.out.println("Addition of " + num1 + " and " +num2+ " is " +sum);
        //         break;
        //     case 2: 
        //         System.out.println("Substraction of " +num1+ " and " +num2+ " is " +sub);
        //         break;
        //     case 3:
        //         System.out.println("Multiplication of " +num1+ " and " +num2+ " is " +mul);
        //         break;
        //     case 4:
        //         System.out.println("Division of " +num1+ " and " +num2+ " is " +div);
        //         break;
        //     default: 
        //         System.out.println("Invalid choice. Please choose between 1-4");
        }
   // }

// i want to make this program in if else statement but i am confused how to make it
