import java.io.FileNotFoundException;

public class StackSolver extends MazeSolver
{
    MyStack worklist;
    public static Maze maze;
    public static Maze mazey = new Maze();

    public StackSolver(Maze mazey)
    {
        super(mazey);
        System.out.println(mazey);
        
    }   

    public void makeEmpty()
    {
        System.out.println("Can you hear this");
        worklist = new MyStack();
        worklist.push(mazey.getStart());
        System.out.println(worklist.top());
    }

    public boolean isEmpty()
    {
        if(worklist.size() == 0)
        {
            System.out.println("Can you dee this?");
            System.out.print(worklist.size());
            return true;
        }
        return false;
    }

    public void add(Square sq)
    {
        worklist.push(sq);
    }

    public Square next()
    {
        Square next_Square = (Square) worklist.pop();
        return next_Square;
    }

    public static void main(String[] args)
    {
        StackSolver s = new StackSolver(mazey);
        try {
            mazey.loadMaze("src//maze-2");
            s.makeEmpty();
            s.isEmpty();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
