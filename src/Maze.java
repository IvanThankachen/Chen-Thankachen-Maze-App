import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Maze
{
    
    public Square[][] maze;
    //private Square[][] maze_2 = maze; // In order to reset the maze.
    private Square start = null;
    private Square end = null;
    private int numRows, numCols;

    public Maze()
    {
        
    }

    public boolean loadMaze(String fname) throws FileNotFoundException
    {
        try
        {
        Scanner scan = new Scanner(new File(fname));

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        System.out.println("what");
        System.out.println("Rows: " + rows + "," + "Columns " + cols );

        this.maze = new Square[rows][cols];

        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col < cols; col++)
            {
                int type = scan.nextInt();
                System.out.println("Type is: " + type);
                maze[row][col] = new Square(row, col, type);
                if(type == 2)
                    start = maze[row][col];
                if(type == 3)
                {
                    end = maze[row][col];
                }
                
            }

        }

        System.out.println(maze);
        return true; // done loading
        }

        catch (FileNotFoundException e)
        {
            System.out.println("Incorrect file format");
            return false;
        }

    }
    

    public ArrayList<Square> getNeighbors(Square sq) 
    {
        ArrayList<Square> neighbor = new ArrayList<Square>();
        {
            if(sq.getRow()-1 >= 0 && maze[sq.getRow()-1][sq.getCol()] != null)
            {
                neighbor.add(maze[sq.getRow()-1][sq.getCol()]);
            }
            if(sq.getCol()+1 < numCols && maze[sq.getRow()][sq.getCol()+1] != null)
            {
                neighbor.add(maze[sq.getRow()][sq.getCol()+1]);
            }
            if(sq.getRow()+1 < numRows && maze[sq.getRow()+1][sq.getCol()] != null)
            {
                neighbor.add(maze[sq.getRow()+1][sq.getCol()]);
            }
            if(sq.getCol()-1 >= 0 && maze[sq.getRow()][sq.getCol()-1] != null)
            {
                neighbor.add(maze[sq.getRow()][sq.getCol()-1]);
            }
            return neighbor;
        }
    }

        public Square getStart()
        {
           

            return start;

            
        }

        public Square getEnd()
        {
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

        public String toString()
        {
            StringBuilder sb = new StringBuilder();

            for( int i=0; i < maze.length; i++ )
            {
                for(int j = 0; j < maze[0].length; j++)
                {
                    sb.append(maze[i][j]);
                }
    
                sb.append("\n");
            }

            return (new String(sb));
        }

}