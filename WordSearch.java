public class WordSearch {
  static boolean[][] visited;

  public static void main(String[] args) {
    char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
    String word = "ABCCED";
    System.out.println(exist(board, word));
  }

  static public boolean exist(char[][] board, String word) {
    visited = new boolean[board.length][board[0].length];

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (word.charAt(0) == board[i][j] && dfs(board, i, j, word, 0)) {
          return true;
        }
      }
    }

    return false;
  }

  static boolean dfs(char[][] board, int i, int j, String word, int k) {
    if (k == word.length()) {
      return true;
    }

    if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || word.charAt(k) != board[i][j] || visited[i][j]) {
      return false;
    }

    visited[i][j] = true;

    if (dfs(board, i + 1, j, word, k + 1) || dfs(board, i - 1, j, word, k + 1) || dfs(board, i, j + 1, word, k + 1)
        || dfs(board, i, j - 1, word, k + 1)) {
      return true;
    }

    visited[i][j] = false;
    return false;
  }

}
