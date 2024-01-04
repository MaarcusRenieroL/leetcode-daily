import java.util.*;

public class MinimumNumberOfOperationsToMakeAnArrayEmpty {
  public static void main(String[] args) {
    int[] arr = new int[] {2,3,3,2,2,4,2,3,4};
    System.out.println(minOperations(arr));
  }

  public static int minOperations(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    
    for (int c : map.values()) {
      if (c == 1) {
        return -1;
      }
      result += Math.ceil((double) c / 3);
    }

    return result;
  }
}
