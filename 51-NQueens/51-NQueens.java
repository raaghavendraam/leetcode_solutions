// Last updated: 04/04/2026, 15:47:50
class Solution {
    public  void helper(char[][] board,int row,List<List<String>> ans){
            if (row == board.length) {
            List<String> solutions = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                solutions.add(new String(board[i])); // convert char[] → String
            }
            ans.add(solutions);
            return;
        }
        for (int j = 0; j < board.length; j++) {
             if(board[row][j]=='.'){
                if(isSafe(row,j,board)){
                    board[row][j]='Q';
                    helper(board, row+1,ans);
                    board[row][j] = '.';
                }
            }
        }
    }
     public  boolean isSafe(int row, int col, char[][] board) {
    
       
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
    
      
        int r = row, c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') return false;
            r--; c--;
        }
    
        
        r = row; c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') return false;
            r--; c++;
        }
    
        return true;
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        helper(board,0,ans);
        return ans;
    }
}