package Asignments;
import java.util.Scanner;
public class calc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("Hello " +name+ " Welcome to the calculator program");

    
    System.out.println("Enter the first digit: ");
    int num1 = scanner.nextInt();
    
    System.out.println("Enter the second number: ");
    int num2 = scanner.nextInt();
    

  }
}
