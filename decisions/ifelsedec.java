package decisions;

public class ifelsedec {
  public static void main(String[] args) {
    int i = 14;
    if (i <10){
      System.out.println("The number is below average!");
    }
    else{
      System.out.println("The digit is above average");
    }
    //Nested if statements
    int x= 20;
    //Outer statements
    if (x < 15){
      System.out.println("i is smaller than 15");

      //Nested if statement
      if (x == 10){
        System.out.println("i is xactly 10");
      }
    }
    else{
      System.out.println("x is the greatest");
    }
  }
  
}
