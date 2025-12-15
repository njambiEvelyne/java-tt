public class Encapsulation {
  
public class Student {
    // 1. Data Hiding: Variables are declared private
    private String name;
    private final int studentId; // ID is final (immutable once set)
    private int grade;           // Assuming grade is an integer percentage

    // Constructor to initialize the mandatory fields
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.grade = 0; // Initialize grade to a default
    }

    // --- Accessor Methods (Getters) ---
    
    public String getName() {
        return name;
    }

    public int getStudentId() {
        // We don't need a setter for studentId since it is final (immutable)
        return studentId;
    }
    
    public int getGrade() {
        return grade;
    }

    // --- Mutator Method (Setter) ---
    
    public void setGrade(int newGrade) {
        // 2. Control: Implementing validation logic in the setter
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully to: " + newGrade);
        } else {
            System.err.println("Error: Grade must be between 0 and 100. Grade not updated.");
        }
    }
    
    public void setName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.name = newName.trim();
        } else {
             System.err.println("Error: Student name cannot be empty.");
        }
    }
}
}
