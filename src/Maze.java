import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Maze
{
    
    private Square[][] maze;
    private Square[][] maze_2 = maze; // In order to reset the maze.
    private Square start = null;
    private Square end = null;

    public Maze()
    {
        
    }

    public boolean loadMaze(String fname)
    {
        Scanner scan = new Scanner(new File (fname));

        int rows = scan.nextInt();
        System.out.println("Do you see this?");
        System.out.println("The rows: " + rows);
        int cols = scan.nextInt();
        System.out.println("Do you see this also?");
        System.out.println("The columns: " + cols);

        int r = Integer.valueOf(rows);
        int c = Integer.valueOf(cols);

        this.maze = new Square[r][c];

        for (int row = 0; row < r; r++)
        {
            for (int col = 0; col < c; col++)
            {
                maze[row][col] = null; // setting everything to null
            }
        }

        return true; // done loading

    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> neighbor = new ArrayList<Square>();
        {
            if (sq.getRow()-1 >= 0) //Condition true as long as row is positive.
            {
                neighbor.add(maze[sq.getRow()-1][sq.getCol()]);
            }

            if(sq.getCol() - 1 >= 0) //Condition true as long as column is positive.
            {
                neighbor.add(maze[sq.getRow()][sq.getCol()-1]);
            }

            if(sq.getRow()+1 < maze.length) //Condition true as long as row doesn't exceed the total amount of rows.
            {
                neighbor.add(maze[sq.getRow()+1][sq.getCol()]);
            }

            if(sq.getCol() + 1 < maze[0].length)  //Condition true as long as column doesn't exceed the total amount of columns.
            {
                neighbor.add(maze[sq.getRow()][sq.getCol()+1]);
            }

            return neighbor;
        }
    }

        public Square getStart()
        {
            for (int i = 0, j = 0 ; i < maze.length && j < maze[0].length;i++,j++)
            {
                if(maze[i][j].getType() == 2)
                {
                    start = new Square (i,j,maze[i][j].getType());
                }

                


            }
            return start;

            
        }

        public Square getEnd()
        {
            for (int i = 0, j = 0 ; i < maze.length && j < maze[0].length;i++,j++)
            {
               if(maze[i][j].getType() == 3)
                {
                    end = new Square (i,j,maze[i][j].getType());
                }

                
            }
            return end;

        
        
        }
        /*
         * resets the array - clears the maze
         * void
         * no parameters
         */
        public void reset()
        {
            for(int i = 0, j= 0; i < maze.length && j < maze[0].length; i++,j++)
            {
                maze[i][j].setValue(0);
                // should work but we know it's probably wrong
            }
        }

}