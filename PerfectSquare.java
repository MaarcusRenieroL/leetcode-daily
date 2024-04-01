public class PerfectSquare {
  public static void main(String[] args) {
    System.out.println(numSquares(121));
  }

  public static int numSquares(int n) {
    if (isPerfectSquare(n)) {
      return 1;
    }

    for (int i = 1; i * i <= n; i++) {
      if (isPerfectSquare(n - i * i)) {
        return 2;
      }
    }

    while (n % 4 == 0) {
      n /= 4;
    }
    if (n % 8 == 7) {
      return 4;
    }

    return 3;
  }

  private static boolean isPerfectSquare(int n) {

    int sqrt = (int) Math.sqrt(n);
    return sqrt * sqrt == n;

  }
}
