import java.util.*;

public class RemoveKDigits {
  public static void main(String[] args) {
    System.out.println(removeKdigits("1432219", 3));
  }

  static String removeKdigits(String num, int k) {
    int l = num.length(), c = 0;
    Stack<Character> s = new Stack<>();
    StringBuilder sb = new StringBuilder();

    if (k == l) {
      return "0";
    }

    while (c < l) {
      while (k > 0 && !s.isEmpty() && s.peek() > num.charAt(c)) {
        s.pop();
        k--;
      }

      s.push(num.charAt(c));
      c++;
    }

    while (k > 0) {
      s.pop();
      k--;
    }

    while (!s.isEmpty()) {
      char cc = s.pop();
      sb.append(cc);
    }

    sb.reverse();

    while (sb.length() > 1 && sb.charAt(0) == '0') {
      sb.deleteCharAt(0);
    }

    return sb.toString();

  }
}
