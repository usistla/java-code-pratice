public class CountInputString {

  public int countInputString(String str) {
    int count = 0;
    for(int i = 0; i < str.length(); i++) {
      if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
       count = count + 1;
     }
    }
    return count;
  }
}
