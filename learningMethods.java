//"method syntax: [access modifier][modifier][return type] - method declaration""[method name][formal argument] - this is called as a method signature" 
// A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.


// variables can be local, static, non-static
// local variables are declared inside a method, block, or constructor
// static variables are declared inside a class, but outside a method, block, or constructor
// non-static variables are declared inside a method, block, or constructor, but outside a class
// static variables are shared by all instances of a class, while non-static variables are unique to each instance of a class
// static variables are initialized only once, while non-static variables are initialized each time an instance of a class is created


public class learningMethods {
    public static void nameMethod(String m_name){   /*[access modifier - public] [modifier - static] [return type - void] 
                                                     [method name - nameMethod] [formal argument - String m_name (here can also be written int a, int b)] */
        System.out.println("Hello "+m_name);
    }
public static void main(String[]args){
    nameMethod("Rahul");
    nameMethod("Shyam");
    }
}


/*public class Main {
    static void myMethod(String fname, int age) {  // here fname and age is called actual arguments.
      System.out.println(fname + " is " + age);
    }
  
    public static void main(String[] args) {
      myMethod("Liam", 5);
      myMethod("Jenny", 8);
      myMethod("Anja", 31);            // and these are called formal arguments.
    }
  }*/

/*public class Main {
    static void checkAge(int age) {
      if (age < 18) {
        System.out.println("Access denied - You are not old enough!");
      } else {
        System.out.println("Access granted - You are old enough!");
      }
  
    }
    public static void main(String[] args) {
      checkAge(20); // Call the checkAge method and pass along an age of 20
    }
}*/

/*calling a method
public class Main {
    static void myMethod() {
        System.out.println("I just got executed!");
        }
        public static void main(String[] args) {
            myMethod(); // calling the method
            }
            }*/
