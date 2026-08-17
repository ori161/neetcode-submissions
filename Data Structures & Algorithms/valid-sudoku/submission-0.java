class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>check_rows = new HashSet<>();
        Set<Character>check_cols = new HashSet<>();
        int t = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j <9; j++){
                if(board[i][j] != '.'){
                    if(check_rows.contains(board[i][j])) return false;
                    check_rows.add(board[i][j]);
                }
                if(board[t][i] != '.'){
                    if(check_cols.contains(board[t][i])) return false;
                    check_cols.add(board[t][i]);
                }
                t++;
            }
            check_rows.clear();
            check_cols.clear();
            t = 0;
        }
        for(int square = 0; square < 9; square++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if(board[row][col] != '.'){
                        if(seen.contains(board[row][col])) return false;
                            seen.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }
}
