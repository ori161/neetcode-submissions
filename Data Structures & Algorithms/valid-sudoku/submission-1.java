class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> check_col = new HashMap<>();
        Map<Integer, Set<Character>> check_row = new HashMap<>();
        Map<String, Set<Character>> check_square = new HashMap<>();

        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.') continue;

                String squareKey = (row/3) + "," + (col/3);

                if(check_row.computeIfAbsent(row, k -> new HashSet<>()).contains(board[row][col]) ||
                check_col.computeIfAbsent(col, k -> new HashSet<>()).contains(board[row][col]) ||
                check_square.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[row][col]))return false;

                check_row.get(row).add(board[row][col]);
                check_col.get(col).add(board[row][col]);
                check_square.get(squareKey).add(board[row][col]);
            }
        }
        return true;
    }
}
