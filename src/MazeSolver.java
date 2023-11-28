import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Stack;
public abstract class MazeSolver
{
    
    String path;
    private Maze maze;
    boolean done = false;
    public abstract void makeEmpty();
    
    // Checks if the worklist is empty and returns true if empty, false otherwise.
    public abstract boolean isEmpty();

    // Adds a square to the worklist.
    public abstract void add(Square sq);

    // Returns the next item from the worklist.
    public abstract Square next();

    public MazeSolver (Maze maze)
    {
        this.maze = maze;
        System.out.println(maze);
        makeEmpty();
        add(maze.getStart());
        
    }

    // Create an empty worklist.
    

    public boolean isSolved()
    {
        if(isEmpty() || path == null)
        {
            return false;
        }
        else
        {
            return true;
        }
       

    }

    public String getPath()
    {
        if(path == null)
        {
            return("There's no solution :(");
        }
        else
        {
            return path;
        }
    }

    public Square step()
    {
        Square current = null;
        if(!isEmpty())
        {

        current = next();
        System.out.println(current.getRow()+","+current.getCol());
        if(current.getType()==3)
        {
            Stack<Square> pathing = new Stack<>();
            pathing.push(current);
            while(current.getPrevious().getType()!=2)
            {
                pathing.push(current.getPrevious());
                current = current.getPrevious();
            }
            pathing.push(maze.getStart());

            while(pathing.isEmpty()==false)
            {
                Square tempo = pathing.pop();
                tempo.setValue(3);
                path+="["+tempo.getRow()+","+tempo.getCol()+"]";

                
            }
            

            return current;

            
        }
        ArrayList<Square> neighbors = maze.getNeighbors(current);
        for(Square neigh:neighbors)
        {
            if(neigh.getValue() == 0)
            {
                neigh.setPrevious(current);
                neigh.setValue(1);
                add(neigh);
                neigh.setMarked(true);
            }

            if(current.getType() == 3)
            {
                neigh.setPrevious(current);
                add(neigh);
                done = true;
                isSolved();

            }

            if(current.getValue() == 1)
            {
                current.setValue(2);
            }
        }

        
        

     }
     return current;
    
       
    }

    public void solve()
    {
        while(!isSolved())
        {
            step();
        }
        getPath();
    }

    

    






}