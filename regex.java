import java.util.regex.Pattern;;
public class regex {
  public static void main(String[] args) {
    System.out.println(Pattern.matches("geeks.*", "geeksforgeeks"));//true

    System.out.println(Pattern.matches("geeks[0-9]+", "geeks12s"));//false
  }
}
johrycgvjhnkmlmmk 