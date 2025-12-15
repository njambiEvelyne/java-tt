class Person {
    public void getRole() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    @Override
    public void getRole() {
        System.out.println("I am a student");
    }
}

class Instructor extends Person {
    @Override
    public void getRole() {
        System.out.println("I am an instructor");
    }
}

public class BasePerson{
    public static void main(String[] args) {
        Person[] people = {
            new Student(),
            new Instructor(),
            new Student()
        };

        for (Person p : people) {
            p.getRole(); // Polymorphism in action
        }
    }
}
