import java.util.Scanner;

public class Maze
{
    
    private Square[][] maze;

    public Maze()
    {
        
    }

    public boolean loadMaze(String fname)
    {
        Scanner scan = new Scanner(System.in);

        String rows = scan.next();
        String cols = scan.next();

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
        ArrayList<Square> list = new ArrayList<Square>();
        
        for (Square nextSquare : list)
        {
            if(s.getRow()  < 0)
        }
    }

}