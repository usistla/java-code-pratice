public class StringReverse {

  public String stringReverse(String s) {
    String rev = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      rev = rev + s.charAt(i);
    }
    return rev;
  }
}
