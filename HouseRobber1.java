public class HouseRobber1 {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };
    System.out.println(rob(nums));
  }

  public static int rob(int[] nums) {
    int rob = 0;
    int norob = 0;
    for (int i = 0; i < nums.length; i++) {
      int newRob = norob + nums[i];
      int newNoRob = Math.max(norob, rob);
      rob = newRob;
      norob = newNoRob;
    }
    return Math.max(rob, norob);
  }
}
