package arrrays;

class Student{
  public int roll_no;
  public String name;

  Student(int roll_no, String name){
    this.roll_no = roll_no;
    this.name =name;

  }
}
public class arrays2 {
  public static void main(String[] args){
    //declare an array of Student
    Student arr [];

    //Allocating memory for 5 objects of type student
    arr = new Student[5];
    
    //initialize the elements of the array
    arr[0] = new Student(1, "Evelyne");
    arr[1] = new Student(2, 
      "Rose");
    arr[2] = new Student(3,"Elizabeth" );
    arr[3] = new Student( 4, "Peter");

    for(int i =0; i<arr.length; i++){
      System.out.println("Element at " +i + " :{" + arr[i].roll_no + " " + arr[i].name +"}");
    }

    int digits []= new int[4];
    digits[0] = 10;
    digits[1] = 20;
    digits[2] = 30;
    digits[3] = 20;

    System.out.println("Trying to acces elements outside the size of the array");
    System.out.println(digits[3]);


  }
  
}
