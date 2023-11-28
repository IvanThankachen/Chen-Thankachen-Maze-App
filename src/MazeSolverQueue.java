public class MazeSolverQueue extends MazeSolver {

    MyQueue<Square> worklist;
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
        makeEmpty();
        add(maze.getStart());
        

    }

    public void makeEmpty()
    {
       this.worklist = new MyQueue<>();
       

    }

    public void add (Square sq)
    {
        this.worklist.enqueue(sq);
    }

    public boolean isEmpty()
    {
        return this.worklist.isEmpty();
    }

    public Square next()
    {
        Square nextSquare = (Square) this.worklist.dequeue();
        return nextSquare;
    }
    
}
