package Methods;

//1. Static methods
class staticandinst {
  public static void greet(){
    System.out.println("Hello Evelyne!");
  }

//2. Instance methods
Class Test{
  //instance method
  public void test(String n){
    this.n = n;
  }
}

  public static void main(String[] args) {
    //Calling the method directly
    greet();

    //Using the class name
    staticandinst.greet();
    //create an instance of the class
    Test t = new Test();
    
    t.test("Geeks for Geeks")
  }
}