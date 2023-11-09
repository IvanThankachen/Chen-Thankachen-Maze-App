
public class StackSolver extends MazeSolver
{
    MyStack worklist;
    public StackSolver(Maze maze)
    {
        super(m);
        
    }   

    public void makeEmpty()
    {
        worklist = new MyStack();
        worklist.push(m.getStart());
    }

    public boolean isEmpty()
    {
        if(worklist.size() == 0)
        {
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
        StackSolver s = new StackSolver(m);
        s.isEmpty();
    }

}
