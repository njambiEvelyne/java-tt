public class classes {
public static void main(String[] args) {
  class cars{
    //Declaration of the instance variables for the class
    String name;
    int age;
    //Declaration for the methods of the class
    void car_def(){
      System.out.println(name + " is " + age + " years old and has been auctioned");
    }

  }

  //Creating objects from the classes
  cars car1 = new cars();
  car1.name = "Volkwagen";
  car1.age = 4;

  car1.car_def();


}

  
}
