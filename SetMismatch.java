import java.util.Arrays;

public class SetMismatch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 4 };
    System.out.println(Arrays.toString(findErrorNums(arr)));
  }

  public static int[] findErrorNums(int[] nums) {
    int x[] = new int[nums.length + 1];

    for (int i : nums) {
      x[i]++;
    }

    int dup = 0, miss = 0;

    for (int i = 1; i < x.length; i++) {
      if (x[i] == 2) {
        dup = i;
      }
      if (x[i] == 0) {
        miss = i;
      }
    }

    return new int[] { dup, miss };

  }
}
