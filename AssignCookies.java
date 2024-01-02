import java.util.*;

public class AssignCookies {
  public static void main(String[] args) {
  
    int[] arr1 = {1,2,3};
    int[] arr2 = {1, 1};

    int result = findContentChildren(arr1, arr2);

    System.out.println("Result : " + result);
  } 

  public static int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);

    int count = 0, i = 0, j = 0;

    while ((i < g.length) && (j < s.length)) {
      if (s[j] >= g[i]) {
        count++;
        i++;
      }
      j++;
    }

    return count;
  }
}
