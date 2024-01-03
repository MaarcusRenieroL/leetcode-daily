import java.util.*;

public class NumberOfLaserBeamsInABank {
  public static void main(String[] args) {
    String[] arr = {"011001","000000","010100","001000"};
    System.out.println(numberOfBeams(arr));
  }

  public static int numberOfBeams(String[] bank) {
    int total = 0;
    int a = 0;

    for (int i = 0; i < bank.length; i++) {
      int count = 0;
      for (int j = 0; j < bank[i].length(); j++) {
        if (bank[i].charAt(j) == '1') {
          count++;
        }
      }
      if (count != 0) {
        a += (count * total);
        total = count;
      }

    }
    return a;
  }
}
