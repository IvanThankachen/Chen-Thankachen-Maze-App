import java.util.ArrayList;
public abstract class MazeSolver
{
    static Maze m;
    String path = "";

    public MazeSolver (Maze maze)
    {
        m = maze;
    }

    // Create an empty worklist.
    public abstract void makeEmpty();
    
    // Checks if the worklist is empty and returns true if empty, false otherwise.
    public abstract boolean isEmpty();

    // Adds a square to the worklist.
    public abstract void add(Square sq);

    // Returns the next item from the worklist.
    public abstract Square next();

    public boolean isSolved()
    {
        if(isEmpty() || next().getType() == 3)
        {
            return true;

        }

        return false;

    }

    public String getPath()
    {
        return path;
    }

    public Square step()
    {
        while(!isEmpty())
        {
            Square sqah = next();
            if(sqah.getType()!=3)
            {
                ArrayList<Square> neighbors = m.getNeighbors(sqah);
                for(Square w : neighbors)
                {
                    if(w.getMarked() != true && w.getType() != 1)
                    {
                        add(w);
                        w.prev = sqah;
                        w.marked = true;
                    }
                    
                    
                }
            }
            else
            {
                System.out.println(getPath());
                return sqah;
            }
        }
            
        return null;
            
            
        
    }

    public void solve()
    {
        while(!isSolved())
        {
            step();
        }
    }






}