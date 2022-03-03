/** I print the strings I get */
public class ArgPrinter {
 public int print(String[] strings) {
  if (strings.length > 0) {
    for(String s : strings) {
      System.out.println("  -> " + s);
    }
  }

  return strings.length;
 }
}
