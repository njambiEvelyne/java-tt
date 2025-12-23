package commadline;

public class classes {
    public class Employee{
      private String name;
      private float salary;

      public Employee(String name, float salary){
        this.name = name;
        this.salary =salary;

      }

      public String getName(){return name;}
      public float getsalary(){return salary;}

      public void setName(String name) {this.name = name;}
      public void setSalary(float salary){this.salary =salary;}
      
    }

    public void displayDetails(){
      System.out.println("Employee: " + name);
      System.out.println("Salary: "+ salary);
    }

    public static void main(String[] args) {
      Employee emp = new Employee("Geek", 10000.f);
      emp.displayDetails();
}
}