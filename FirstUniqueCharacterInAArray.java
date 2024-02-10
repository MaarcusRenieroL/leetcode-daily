public class FirstUniqueCharacterInAArray {
  public static void main(String[] args) {
    System.out.println(firstUniqChar("test"));
  }

  public static int firstUniqChar(String s) {
    int[] charCounts = new int[26];
    for (int i = 0; i < s.length(); i++) {
      charCounts[s.charAt(i) - 'a']++;
    }

    for (int i = 0; i < s.length(); i++) {
      if (charCounts[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }
}
