import java.util.*;

public class RevealCards {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(deckRevealedIncreasing(new int[] { 17, 13, 11, 2, 3, 5, 7 })));
  }

  static int[] deckRevealedIncreasing(int[] d) {
    LinkedList<Integer> q = new LinkedList<>();
    Arrays.sort(d);

    int[] r = new int[d.length];

    for (int i = 0; i < d.length; i++) {
      q.offer(i);
    }

    for (int i = 0; i < d.length; i++) {
      r[q.poll()] = d[i];
      q.offer(q.poll());
    }

    return r;
  }
}
