public class LongestIncreasingSubsequence {
  public static void main(String[] args) {
    System.out.println(lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
  }

  public static int lengthOfLIS(int arr[]) {
    int[] count = new int[arr.length];
    int size = 0;

    for (int num : arr) {
      int low = 0, high = size;
      while (low != high) {
        int mid = (low + high) / 2;
        if (count[mid] < num) {
          low = mid + 1;
        } else {
          high = mid;
        }
      }
      count[low] = num;
      if (low == size) {
        ++size;
      }

    }

    return size;
  }
}
