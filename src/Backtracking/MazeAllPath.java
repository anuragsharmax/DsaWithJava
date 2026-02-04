/*
Maze All Paths Problem using Backtracking

Goal:
- Print ALL possible paths from the top-left (0,0) to the bottom-right cell
  of a grid.
- Movement is allowed in four directions:
    Down  -> 'D'
    Right -> 'R'
    Up    -> 'U'
    Left  -> 'L'
- A cell cannot be visited more than once in a single path.

Why this is a backtracking problem:
- At each cell, multiple choices (directions) are available.
- We choose one direction, explore it completely, then come back and try others.
- The path is built step by step and undone while returning.

How the algorithm works:
1. `board` represents the grid where:
   - true  → cell is free to visit
   - false → cell is already visited in the current path

2. `p` stores the path taken so far using characters (D, R, U, L).

3. Base conditions:
   - If the current cell is already visited, return immediately.
   - If we reach the destination cell (bottom-right), print the path.

4. Mark the current cell as visited before exploring further moves.

5. Try all valid moves:
   - Down, Right, Up, Left (only if inside grid boundaries).

6. After exploring all paths from the current cell,
   unmark it (backtrack) so it can be used in other paths.

Important Notes:
- Visited marking prevents infinite loops and revisiting cells.
- Boundary checks ensure we stay inside the grid.
- Backtracking is achieved by undoing the visited mark after recursion.
- This approach explores all valid paths without duplicates.

Time Complexity:
- Exponential in nature because all possible paths are explored.

This is a classic example of recursion + backtracking on a grid.
*/

package Backtracking;

public class MazeAllPath {
    public static void main(String[] args) {
        boolean[][]board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPath("",board,0,0,0);
    }
    static void allPath(String p,boolean[][]board,int r,int c,int count){
        if(board[r][c]==false){
            return;
        };
        if(r== board.length-1&&c==board[0].length-1){
            System.out.println(p);
            System.out.println(count);
            return;
        }
        board[r][c]=false;
        if(r<board.length-1){
            allPath(p+'D',board,r+1,c,count+1);
        }
        if(c<board[0].length-1){
            allPath(p+'R',board,r,c+1,count+1);
        }
        if(r>0){
            allPath(p+'U',board,r-1,c,count+1);
        }
        if(c>0){
            allPath(p+'L',board,r,c-1,count+1);
        }
        board[r][c]=true;
    }
}
