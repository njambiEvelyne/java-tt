package decisions;

public class switchcase {
  public static void main(String[] args){
    int num = 20;
    switch (num){
      case 5:
      System.out.println("It is 5");
      break;

      case 10:
        System.out.println("It is 10");
        break;

      case 15:
        System.out.println("It is 15");
        break;

      case 20:
        System.out.println("It is 20");
        break;

      default:
        System.out.println("Not present");
    }
    //Example of switch expression using Java
    int day = 3;
    String dayName = switch(day){
      case 1 -> "Sunday";
      case 2 -> "Monday";
      case 3 -> "Tuesday";
      default -> "Invalid day";
    };
    System.out.println(dayName);
  }
}
