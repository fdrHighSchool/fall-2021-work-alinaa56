public class Rocket {
  public static void main(String[] args) {
    triangle();
    square();
    name();
    square();
    triangle();
  }

  public static void triangle() {
    System.out.println("   /\\");
    System.out.println("  /  \\");
    System.out.println(" /    \\");
  }

  public static void square() {
    System.out.println("+------+");
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("+------+");
  }

  public static void name() {
    System.out.println("|United|");
    System.out.println("|States|");
  }

}
