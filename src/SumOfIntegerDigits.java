public class SumOfIntegerDigits {

  public int sumOfIntegerDigits(int x) {
    String s = String.valueOf(x);
    int a = 0;
    for (int i = 0; i < s.length(); i++) {
      a = a + Integer.parseInt(String.valueOf(s.charAt(i)));
    }
    return a;
  }

  public int sumOfIntegerDigits2(int x) {
    int remainder = 0;
    while (x != 0) {
      remainder = remainder + (x % 10);
      x = x / 10;
    }
    return remainder;
  }

}

//56/ 10 = 5,6
//5/10 = 0, 5