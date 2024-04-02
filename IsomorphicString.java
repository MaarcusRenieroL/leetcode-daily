import java.util.HashMap;

public class IsomorphicString {
  public static void main(String[] args) {
    String s = "egg";
    String t = "add";
    System.out.println(isIsomorphic(s, t));
  }

  static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    HashMap<Character, Character> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c1 = s.charAt(i), c2 = t.charAt(i);

      if (map.containsKey(c1)) {
        if (map.get(c1) != c2) {
          return false;
        }
      } else {
        if (map.containsValue(c2)) {
          return false;
        }

        map.put(c1, c2);
      }
    }

    return true;

  }
}
