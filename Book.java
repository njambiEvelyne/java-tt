public class Book {
    // Instance Variables (Fields)
    private String title;
    private String author;
    private double price;
    private int publicationYear;

    /**
     * Parameterized Constructor:
     * Used to initialize all four fields when a new Book object is created.
     */
    public Book(String bookTitle, String bookAuthor, double bookPrice, int bookYear) {
        // Initialization and validation logic
        this.title = bookTitle;
        this.author = bookAuthor;
        
        // Example of initialization with validation logic
        if (bookPrice > 0) {
            this.price = bookPrice;
        } else {
            // Assign a default valid value or throw an exception
            this.price = 0.0; 
            System.err.println("Warning: Book price must be positive.");
        }
        
        this.publicationYear = bookYear;
        
        System.out.println("A new Book object has been created and initialized.");
    }
    
    /**
     * Helper method to display the book's information.
     */
    public void displayDetails() {
        System.out.println("--- Book Details ---");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + String.format("%.2f", this.price));
        System.out.println("Year: " + this.publicationYear);
    }
    
    // Getters and setters (omitted for brevity)
}

// --- Main execution class to demonstrate the constructor ---
class BookStore {
    public static void main(String[] args) {
        // Calling the constructor using 'new' to create and initialize the object
        Book novel = new Book("The Java Journey", "Evelyne", 49.99, 2024); 
        
        // The object is now guaranteed to have valid initial values
        novel.displayDetails();
        
        System.out.println("\n--------------------");
        
        // Creating another book, demonstrating the price validation
        Book textbook = new Book("OOP Fundamentals", "Dr. Code", -10.0, 2020); 
        textbook.displayDetails();
    }
}