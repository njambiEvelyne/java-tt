package Methods;

public class callstack {
      public static void D(){
      float d = 40.5f;
      System.out.println("In method D");
    }

    public static void C(){
      double c = 30.5;
      System.out.println("In method C");
    }

    public static void B(){
      int b = 20;
      C();
      System.out.println("In method B");
    }

    public static void A (){
      int a = 10;
      B();
      System.out.println("In method A");
    }
    public static void main(String[] args) {
      A();
      D();
    }
  }

