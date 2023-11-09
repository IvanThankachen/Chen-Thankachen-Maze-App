public class QueueSolver extends MazeSolver {

    MyQueue worklist;
    public QueueSolver(Maze maze)
    {
        super(m);
        

    }

    public void makeEmpty()
    {
        worklist = new MyQueue();
        worklist.enqueue(m.getStart());

    }

    public void add (Square sq)
    {
        worklist.enqueue(sq);
    }

    public boolean isEmpty()
    {
        if(worklist.size() == 0)
        {
            return true;
        }
        return false;
    }

    public Square next()
    {
        Square nextSquare = (Square) worklist.dequeue();
        return nextSquare;
    }
    
}
