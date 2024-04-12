public class TrappingRainWater {
  public static void main(String[] args) {
    System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
  }

  static int trap(int[] h) {
    int l = 0, r = h.length - 1, res = 0, lb = h[l], rb = h[r];

    while (l < r) {
      if (lb <= rb) {
        res += lb - h[l];
        l++;
        lb = (lb > h[l]) ? lb : h[l];
      } else {
        res += rb - h[r];
        r--;
        rb = (rb > h[r]) ? rb : h[r];
      }
    }

    return res;
  }
}
