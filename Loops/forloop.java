package Loops;

public class forloop {
  public static void main(String[] args) {
    for (int i = 0; i<=10; i++){
      System.out.println(i);
    }
    
    String [] names = {"Sweta", "Gudly", "Amiya"};
    for(String name: names){
      System.out.println("Name: " + name);
    }
  }
}
