public class classes {
public static void main(String[] args) {
  class cars{
    //Declaration of the instance variables for the class
    String name;
    int age;
    int level = 1;
    //Declaration for the methods of the class
    void car_def(){
      System.out.println(name + " is " + age + " years old and has been auctioned. It is a level " +level + " car.");
    } 

  }
 
  //Creating objects from the classes
  cars car1 = new cars();
  car1.name = "Volkwagen";
  car1.age = 4;

  car1.car_def();

  //Inheritance
  class Animal {
    String name;
    double years;

    public Animal(String name) {
      this.name = name;
      
    }

    public void old(double years){
      this.years = years;
      System.out.println(name + " is "+ years + " years old.");
    }

    public void eat() {
      System.out.println(name + " is eating.");
    }

  }
  //Child class
  class Dog extends Animal{
    //Dog inherits the 'name' field and the 'eat' method
    public Dog(String name){
      //Calls the constructor of the Superclass (Animal)
      super(name);
    }
    public void bark(){
      System.out.println(name + " is barking.");
    }
  
  }

  Dog mydog = new Dog("Buddy");

  //mydog can call the inherited eat() method
  mydog.eat(); //Output: Buddy is eating

  //mydog can call its own specific bark() method
  mydog.bark(); //Output: Buddy is barking
  mydog.old(3.0);


}

  
}
