class Solution {
    public boolean isValidSudoku(char[][] board) {
        // need a map with 9 vals and a set inside them for the 3 x 3 boxes
        //set for column
        //set for rows
        if(board == null){
            return false;
        }
        int boxX = 0;
        int boxY = 0;
        Set<Character>rowsSet = new HashSet<>();
        Set<Character>colsSet = new HashSet<>();
        Map<Integer, Set<Character>>boxsSet = new HashMap<>(); //two is a fixed number cause we only deal with 2d matrix x,y
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    boxX = i / 3;
                    boxY = j / 3;
                    if(!(rowsSet.add(board[i][j]))){
                        return false;
                    }
                    if(!(boxsSet.computeIfAbsent(boxX * 3 + boxY, k -> new HashSet<>()).add(board[i][j]))){
                        return false;
                    }
                }
                if(board[j][i] != '.'){
                    if(!(colsSet.add(board[j][i]))){
                        return false;
                    }
                }
            }
            rowsSet.clear();
            colsSet.clear();
        }
        return true;
    }
}
