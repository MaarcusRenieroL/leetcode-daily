public class UnableToEatLunch {
  public static void main(String[] args) {
    int[] students = new int[] { 1, 1, 0, 0 };
    int[] sandwiches = new int[] { 0, 1, 0, 1 };

    System.out.println(countStudents(students, sandwiches));
  }

  static int countStudents(int[] students, int[] sandwiches) {
    int o = 0, z = 0;

    for (int s : students) {
      if (s == 0) {
        z++;
      }

      if (s == 1) {
        o++;
      }
    }

    for (int s : sandwiches) {
      if (s == 0) {
        if (z == 0) {
          return o;
        }

        z--;
      } else {
        if (o == 0) {
          return z;
        }

        o--;
      }
    }

    return 0;
  }
}
