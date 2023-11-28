import java.io.FileNotFoundException;

public class MazeSolverStack extends MazeSolver
{
    public MyStack<Square> worklist;

    

    public MazeSolverStack(Maze mazey)
    {
        super(mazey);
        makeEmpty();
        add(mazey.getStart());
        
        
    }   

    public void makeEmpty()
    {
        System.out.println("Can you hear this");
        this.worklist = new MyStack<>();
        
        
    }

    
    public boolean isEmpty()
    {
        return this.worklist.isEmpty();
    }

    public void add(Square sq)
    {
        this.worklist.push(sq);
    }

    public Square next()
    {
        Square next_Square = (Square) this.worklist.pop();
        return next_Square;
    }

    public static void main(String[] args)
    {
        Maze m = new Maze();
        MazeSolverStack s = new MazeSolverStack(m);
        s.makeEmpty();
        if(s.worklist == null)
            System.out.println("Why?");
        else    System.out.println("It's not.");
    }



}