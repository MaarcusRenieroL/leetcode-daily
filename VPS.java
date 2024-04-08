public class VPS {
  public static void main(String[] args) {
    System.out.println(checkValidString("(*))"));
  }

  static boolean checkValidString(String s) {
    int lmin = 0, lmax = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(') {
        lmin++;
        lmax++;
      }

      if (c == ')') {
        lmin--;
        lmax--;
      }

      if (c == '*') {
        lmin--;
        lmax++;
      }

      if (lmax < 0) {
        return false;
      }

      if (lmin < 0) {
        lmin = 0;
      }
    }

    return lmin == 0;
  }
}
