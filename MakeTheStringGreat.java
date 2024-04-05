import java.util.Stack;

public class MakeTheStringGreat {
  public static void main(String[] args) {
    System.out.println(makeGood("leEeetcode"));
    System.out.println(makeGood("abBAcC"));
  }

  static String makeGood(String str) {
    Stack<Character> s = new Stack<>();

    for (char c : str.toCharArray()) {
      if (!s.isEmpty() && Math.abs(c - s.peek()) == 32) {
        s.pop();
      } else {
        s.push(c);
      }
    }

    StringBuilder r = new StringBuilder();

    for (int i = s.size() - 1; i >= 0; i--) {
      r.insert(0, s.pop());
    }

    return r.toString();

  }
}
