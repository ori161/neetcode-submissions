class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row_seen = set()
        column_seen = set()
        box_seen = defaultdict(set)

        for i in range(9):
            for j in range(9):
                if board[i][j] in row_seen:
                    return False

                if board[j][i] in column_seen:
                    return False
                
                box_row = i//3
                box_column = j//3

                if board[i][j] in box_seen[tuple([box_row, box_column])]:
                    return False
                if board[i][j] != '.':
                    row_seen.add(board[i][j])
                    box_seen[tuple([box_row, box_column])].add(board[i][j])
                if board[j][i] != '.':
                    column_seen.add(board[j][i])

            row_seen.clear()
            column_seen.clear()
        return True