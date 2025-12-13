package arrrays;
//import java.util.Scanner;
interface Person{
      void name(String inputName);
      void character();

    }
public class interfaces2 {
  static class person1 implements Person {
    @Override 
    public void name(String inputName){
      System.out.println("My name is "+ inputName);
    }

      @Override
      public void character(){
        System.out.println("I'm a helpful and analytical person.");
      }
    }
  
    
  
    public static void main(String[] args) {
    
    person1 myPerson = new person1();

    myPerson.name("Alice");;
    myPerson.character();
  }
}
