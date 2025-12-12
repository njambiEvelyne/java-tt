package variableargument;

public class varargs {
  //Method that accepts variable number of String arguments using varargs
  //Varargs = allow a method to accept a varying # of arguments
  //      makes methods more flexible, no need for overloaded methods
  //      java will pack the arguments into an array
 //       ...(ellipsis)

  public static void Names(String...n){
    //Iterate through the arrray and print each name
    for(String i : n) {
      System.out.print(i + " ");
    }
    System.out.println();
   
  }
  
  //Static add method taking indefinite number of arguments

   static int add(int...numbers){
    int sum =0; 
    for (int number : numbers){
      sum += number;
    }
    return sum;

   }
   static double average(double...conts){
    double summation = 0;
    if (conts.length == 0){
      return 0;
    }
    for(double o :conts){
      summation += o;
    }
    return summation/conts.length;
   }

   //varargs with other arguments
   static void fun(String s, int ...a){
    System.out.println("String: " + s);
    System.out.println("Number of arguments is: " + a.length);

        //Using for each loop to display contents of a 
    for(int t:a){
      System.out.println(t+" ");

    System.out.println();
    }
   }
  public static void main(String[] args) {
    Names("geeks1, geeks1, geeks3, geeks4, geeks5");
    Names("geek12, geek13, geek14, geek17");
    System.out.println(add(12,34,56,78,90));
    System.out.println(average(12.34, 234,223, 3456, 23.6));
    fun("Evelyne", 200, 400, 34);

  }
}
