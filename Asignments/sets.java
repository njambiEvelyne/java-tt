package Asignments;
import java.util.*;
public class sets {

  public static void main(String[] args) {
    Set<Integer> setA = new HashSet<>(Arrays.asList(10, 11, 12, 13));
        
        // Define Set B: {13, 14, 15}
        Set<Integer> setB = new HashSet<>(Arrays.asList(13, 14, 15));

        // 1. Calculate A - B
        Set<Integer> diffAB = new HashSet<>(setA); 
        diffAB.removeAll(setB); // Removes all elements of B from A
        System.out.println("A - B: " + diffAB);

        // 2. Calculate B - A
        Set<Integer> diffBA = new HashSet<>(setB);
        // TODO: Use the .removeAll() method here to finish the task!
        
        // 3. Check if they are equal
        if (diffAB.equals(diffBA)) {
            System.out.println("Sets are equal.");
        } else {
            System.out.println("Sets are NOT equal.");
        }
  }
}