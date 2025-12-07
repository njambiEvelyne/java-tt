public class interfaces {
  public static void main(String[] args){
    interface Creature{
      void sound();
    }

    class Dog implements Creature {
      public void sound(){
        System.out.println("A dog woofs");
      }
    }

    Creature dog = new Dog();
    dog.sound();
  }
}
