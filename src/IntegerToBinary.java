public class IntegerToBinary {

  public String integerToBinary(int x) {
    String remainder = "";
     while (x != 0) {
       remainder = remainder + x % 2;
       x = x / 2;
     }
     StringBuilder finalString = new StringBuilder();
     for(int i = remainder.length() - 1; i >= 0; i--) {
       finalString.append(remainder.charAt(i));
     }
     return finalString.toString();
  }

}
