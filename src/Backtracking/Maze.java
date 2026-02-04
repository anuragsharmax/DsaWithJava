/*
Maze Path Problem using Recursion & Backtracking

Goal:
- Print all possible paths from top-left to bottom-right of a grid.
- Grid size is r x c.
- We move until we reach cell (1,1).

Moves allowed:
1. Down     -> 'D'  (row decreases)
2. Right    -> 'R'  (column decreases)
3. Diagonal -> 'A'  (row and column both decrease)

Three versions are implemented:

1) countDownRight()
   - Allows only Down and Right moves.
   - Generates all paths WITHOUT diagonal movement.

2) countDownRightDiagonal()
   - Allows Down, Right, and Diagonal moves.
   - Generates all paths WITH diagonal movement.

3) DownRightWithRestrictions()
   - Allows Down and Right moves.
   - Some cells are blocked using a boolean matrix.
   - A path is abandoned immediately if it enters a blocked cell.

How recursion works:
- `p` stores the path formed so far.
- `r` and `c` represent the current position in the grid.
- From each cell, all valid moves are tried using recursive calls.
- Each recursive call represents choosing one move.
- When (r == 1 && c == 1), a valid path is formed and printed.

Why this is backtracking:
- At each cell, multiple choices are possible.
- One choice is explored completely before trying the next.
- Control returns back after each recursive call.
- Path information is preserved across recursive calls.

Important Notes:
- `if` is used instead of `while` because we are making decisions,
  not repeating actions at the same state.
- Restriction check is done BEFORE destination check to avoid
  printing invalid paths.
- Array indexing uses (r-1, c-1) because recursion is 1-based
  while Java arrays are 0-based.
- String concatenation (p + move) works without explicit undo
  because String is immutable in Java.

This approach ensures:
- All valid paths are explored
- Blocked paths are correctly ignored
- No duplicate paths are generated
- Output paths are clear and unambiguous
*/

package Backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println("path without Diagnol :");
        countDownRight("",3,3);
        System.out.println("path with Diagnol :");
        countDownRightDiagonal("",3,3);
        System.out.println("path with restrictions :");
        boolean[][]board={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        DownRightWithRestrictions("",board,3,3);
    }
    static void countDownRight(String p, int r, int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            countDownRight(p+'D',r-1,c);
        }
        if(c>1){
            countDownRight(p+'R',r,c-1);
        }
    }
    static void countDownRightDiagonal(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1&&c>1){
            countDownRightDiagonal(p+'A',r-1,c-1);
        }
        if(r>1){
            countDownRightDiagonal(p+'D',r-1,c);
        }

        if(c>1){
            countDownRightDiagonal(p+'R',r,c-1);
        }
    }
    static void DownRightWithRestrictions(String p,boolean[][]restr, int r, int c){
        if(restr[r-1][c-1]==false){
            return;
        }
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            DownRightWithRestrictions(p+'D',restr,r-1,c);
        }
        if(c>1){
            DownRightWithRestrictions(p+'R',restr,r,c-1);
        }
    }
}
