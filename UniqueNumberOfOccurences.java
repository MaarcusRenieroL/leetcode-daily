import java.util.*;

public class UniqueNumberOfOccurences {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 1, 1, 3 };
    System.out.println(uniqueOccurrences(arr));
  }

  public static boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> frequencies = new HashMap<>();

    for (int num : arr) {
      frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
    }

    Set<Integer> set = new HashSet<>();

    for (int num : frequencies.values()) {
      set.add(num);
    }

    return set.size() == frequencies.size();
  }
}
