package commadline;

class commandline {
  public static void main(String[] args) {
    // System.out.println(args[0]);
    // System.out.println(args[1]);
    // 1. Check for the correct number of arguments (must be exactly two)
      if (args.length != 2) {
          System.out.println("Error: Please provide exactly two numbers as arguments.");
          System.out.println("Usage: java CommandLineAdder <number1> <number2>");
          return; // Exit the program immediately
        }

      try {
            // 2. Convert the String arguments to numerical types (doubles)
            // We use Double.parseDouble() because command-line arguments are always strings.
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

          // 3. Perform the calculation
        double sum = num1 + num2;

            // 4. Print the result
        System.out.println("--- Command Line Calculation ---");
        System.out.println("First Argument: " + args[0]);
        System.out.println("Second Argument: " + args[1]);
        System.out.println("Result: " + num1 + " + " + num2 + " = " + sum);
            
      } catch (NumberFormatException e) {
            // 5. Handle the error if the arguments are not valid numbers
          System.out.println("Error: Both arguments must be valid numbers.");
          System.out.println("Detail: " + e.getMessage());
        }
  }
}
