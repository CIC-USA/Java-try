import java.util.*;

class Main {
  public static int adding (int x, int y){
    return x + y;
  }
  public static int multiplying (int x, int y){
    return x * y;
  }
  public static int subtracting (int x, int y){
    return x - y;
  }
  public static int dividing (int x, int y){
    return x / y;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Scanner playeri = new Scanner(System.in);

    System.out.println("Please input your first number");
    int g = input.nextInt();
    System.out.println("Please input your second number");
    int h = input.nextInt();
    System.out.println("Please input your second number");
    String b = playeri.nextLine();

    if (b.equals("*")){
      System.out.println(multiplying(g,h));
    }
    if (b.equals("+")){
      System.out.println(adding(g,h));
    }
    if (b.equals("-")){
      System.out.println(subtracting(g,h));
    }
    if (b.equals("/")){
      System.out.println(dividing(g,h));
    }
  }
}
