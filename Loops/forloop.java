package Loops;

public class forloop {
  public static void main(String[] args) {
    for (int i = 0; i<=10; i++){
      System.out.println(i);
    }
    //Use of the for-each to iterate over an array of items
    String [] names = {"Sweta", "Gudly", "Amiya"};
    for(String name: names){
      System.out.println("Name: " + name);
    }
    //Using for to iterate over an array of items
    String[] names2 = {"Evelyne", "John", "David"};

  for (int i = 0; i < names2.length; i++) {
      System.out.println("Name: " + names2[i]);
  }
  // You must manage the index (i) and boundary (names.length)
  }
}
