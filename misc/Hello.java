public class Hello {
  public static String welcome_message = "HELLO WORLD";
  private static ArgPrinter printer = new ArgPrinter();

  public static void main(String[] args) {
    System.out.println(welcome_message);
    printer.print(args);
  }
}
