import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regex {
  public static void main(String[] args) {
    System.out.println(Pattern.matches("geeks.*", "geeksforgeeks"));//true

    System.out.println(Pattern.matches("geeks[0-9]+", "geeks12s"));//false

    Pattern p = Pattern.compile("geeks");
    Matcher m = p.matcher("geeksforgeeks");

    while (m.find()) {
      System.out.println("Pattern found from " + m.start() + "to " + (m.end()-1));
      
    }
  }
}
