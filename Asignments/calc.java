package Asignments;
import java.util.Scanner;
public class calc {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("What is your name?");
      String name = scanner.nextLine();
      System.out.println("Hello " +name+ " Welcome to the calculator program");

      
      System.out.println("Enter the first digit: ");
      int num1 = scanner.nextInt();
      
      System.out.println("Enter the second number: ");
      int num2 = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Select the oeration to be performed('=', '-', '*', '/')...");
      String choice = scanner.nextLine();

      int result = 0;
      switch (choice) {
        case "+":
          result = num1 + num2;
          System.out.println(num1 +"+"  +num2 +"=" +result);
          break;

        case "-":
          result = num1 - num2;
          System.out.println(num1 + "-" + num2 + "="+ result);
          break;

        case "*":
          result = num1 * num2;
          System.out.println(num1 +"*" + num2 +"=" + result);
          break;

        case "/":
          if (num2 ==0) {
            System.out.println("Zero division error!");
            
          }
          else{
            double divResult = (double)num1 / num2;
            System.out.println(num1 +"/" + num2 +  "=" + divResult);

          }
          break;

          default:
            System.out.println("The case is not defined!");
            break;

          
        
      
        
      }
    }
    

  }
}
