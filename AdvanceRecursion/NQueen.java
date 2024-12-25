package AdvanceRecursion;
import java.util.*;

public class NQueen{

    public void saveBoard(char[][] board, List<List<String>> allboard) {
        List<String> newboard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row.append('Q');
                } else {
                    row.append('.');
                }
            }
            newboard.add(row.toString());
        }
        allboard.add(newboard);
    }
    


    public boolean isSafe(int row,int col, char[][] board){
        //horizontal check
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //upper left
        int r=row;
        for(int c=col;c>=0 &&r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //upper right
        r=row;
        for(int c=col;c<board.length &&r>=0;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower left
        r=row;
        for(int c=col;c>=0 &&r<board.length;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower right
        r=row;
        for(int c=col;c<board.length &&r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        
        return true;
    }

    //recursive function
    public void helper(char[][] board,List<List<String>> allboard,int col){

        //base
        if(col==board.length){
            saveBoard(board,allboard);
            return;
        }

        for (int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allboard,col+1);
                board[row][col]='.';
            }
        }

    }


    public List<List<String>> solvenqueen (int n){
        List<List<String>> allboard = new ArrayList<>();
        char[][] board=new char[n][n];
        helper(board, allboard, 0);
        return allboard;
    }

    public static void main(String[] args) {
        int n = 4;
        NQueen nQueen = new NQueen();
        List<List<String>> solutions = nQueen.solvenqueen(n);
        // Now you can process or print solutions if needed
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println(); // separate each solution with a blank line
        }
    }
    
}

