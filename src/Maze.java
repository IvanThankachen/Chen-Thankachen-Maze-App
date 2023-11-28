import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Maze
{
    
    public Square[][] maze;
    //private Square[][] maze_2 = maze; // In order to reset the maze.
    private Square start = null;
    private Square end = null;
    private int rows,cols;
    private int numRows,numCols;

    public Maze()
    {
        
    }

    public boolean loadMaze(String fname) throws FileNotFoundException
    {
        try
        {
        Scanner scan = new Scanner(new File(fname));

         rows = scan.nextInt();
         cols = scan.nextInt();
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
        System.out.println("["+getStart().getRow()+","+getStart().getCol()+"]");
        int neighbors = 0;
        ArrayList<Square> neighbor = new ArrayList<Square>();
        {
            if(sq.getRow() -1 >= 0 && maze[sq.getRow()-1][sq.getCol()].getType() != 1 )
            {
                System.out.println("["+sq.getRow()+","+sq.getCol()+"]");
                System.out.println("-------------");
                neighbor.add(maze[sq.getRow()-1][sq.getCol()]);
                neighbors+=1;
                
                
            }
            if(sq.getCol()+1 < cols  && maze[sq.getRow()][sq.getCol()+1].getType() != 1 )
            {
                System.out.println("["+sq.getRow()+","+sq.getCol()+"]");
                neighbor.add(maze[sq.getRow()][sq.getCol()+1]);
                neighbors+=1;
                
            }
            if(sq.getRow()+1 < rows  && maze[sq.getRow()+1][sq.getCol()].getType() != 1 )
            {
                System.out.println("["+sq.getRow()+","+sq.getCol()+"]");
                neighbor.add(maze[sq.getRow()+1][sq.getCol()]);
                neighbors+=1;
            }
            if(sq.getCol() - 1 >= 0  &&  maze[sq.getRow()][sq.getCol()-1].getType() != 1 )
            {
                System.out.println("["+sq.getRow()+","+sq.getCol()+"]");
                neighbor.add(maze[sq.getRow()][sq.getCol()-1]);
                neighbors+=1;
            }
            System.out.println(neighbors);
            neighbors = 0;
            return neighbor;
        }
    }

        public Square getStart()
        {
           
           for (int row = 0; row < rows; row++)
           {
            
            for (int col = 0; col < cols; col++)
            {
               if(maze[row][col].getType() == 2)
                return start = maze[row][col];

                
                
            }
           }

           return null;
           

            
        }

        public Square getEnd()
        {
           for (int row = 0; row < rows; row++)
           {
            
            for (int col = 0; col < cols; col++)
            {
               if(maze[row][col].getType() == 3)
                return end = maze[row][col];

                
                
            }
           }

           return null;
        }
        
        /*
         * resets the array - clears the maze
         * void
         * no parameters
         */
        public void reset()
        {
           for(int i = 0; i < rows; i++)
           {
            for(int j=0; j < cols; j++)
            {
                maze[i][j].setValue(0);
            }
           }
        }

        public String toString()
        {
            StringBuilder sb = new StringBuilder();

            for( int i=0; i < rows; i++ )
            {
                for(int j = 0; j < cols; j++)
                {
                    sb.append(this.maze[i][j]);
                }
    
                sb.append("\n");
            }

            return (new String(sb));
        }

}