package arrrays;

public abstract class Student {
    private String name;
    private int studentId;

    // Concrete method: common logic for all students
    public void registerCourse(String courseName) {
        System.out.println(name + " registered for: " + courseName);
    }

    // Abstract method: MUST be implemented differently by subclasses
    public abstract double calculateTuition();
    
    // Constructor (called by subclasses)
    public Student(String name, int id) {
        this.name = name;
        this.studentId = id;
    }
}