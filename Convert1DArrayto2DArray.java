import java.util.*;

public class Convert1DArrayto2DArray {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 1, 3, 2, 1};
    List<List<Integer>> result = findMatrix(arr);
    System.out.println(result);
  }

  public static List<List<Integer>> findMatrix(int[] nums) {
    int freq[] = new int[nums.length + 1];

    ArrayList<List<Integer>> ans = new ArrayList<>();
    for (int c : nums) {
      if (freq[c] >= ans.size()) {
        ans.add(new ArrayList<>());
      }

      ans.get(freq[c]).add(c);
      freq[c]++;
    }

    return ans;
  }
}
