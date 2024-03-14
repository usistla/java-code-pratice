public class SwapTwoNumbers {

  public void swap(int x, int y) {
    System.out.println("x is " + x);
    System.out.println("y is " + y);
    int tmp;
    tmp = x;
    x = y;
    y = tmp;
    System.out.println("x is " + x);
    System.out.println("y is " + y);

    int tmp1;
    tmp1 = x + y;
    x = tmp1 - x;
    y = tmp1 - y;
    System.out.println("x is " + x);
    System.out.println("y is " + y);
  }

}
