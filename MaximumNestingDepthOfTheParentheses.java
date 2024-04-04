public class MaximumNestingDepthOfTheParentheses {
  public static void main(String[] args) {
    System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
  }

  static int maxDepth(String s) {
    int r = 0, t = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        t++;
      } else if (s.charAt(i) == ')') {
        t--;
      }

      r = (r > t) ? r : t;
    }

    return r;
  }

}
