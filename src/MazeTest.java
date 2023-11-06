import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MazeTest {

    static Maze m = new Maze();
    public static void main(String[] args)
    {
        try{
            System.out.println(loadMazeError());
            System.out.println(loadMazeTest());
        } catch (Exception e){}
        
        System.out.println(m.maze);

        // neighbor tests
        ArrayList<Square> neighborTests = new ArrayList<>();
        neighborTests = neighborsCorners();
        
        // corners
        for (Square a : neighborTests)
            System.out.println("Corners: "+ a);

        // edge
        neighborTests = neighborsEdge();
        for (Square a : neighborTests)
            System.out.println("Edges: " + a);

        // corner
        neighborTests = neighborsMiddle();
        for (Square a : neighborTests)
            System.out.println("Middle: "+ a);

        // start
        System.out.println("Start: " + m.getStart());

        // end
        System.out.println("End : " + m.getEnd());

        // print out whole thing
        System.out.println(m);
        
    }

    static private boolean loadMazeError() throws IOException{
        return m.loadMaze("notafile");
    }

    static private boolean loadMazeTest() throws IOException{
        return m.loadMaze("src//maze-2");
    }

    static private ArrayList<Square> neighborsCorners (){
        System.out.println(m.maze[4][4]);
        System.out.println(m.maze);
        return m.getNeighbors(m.maze[4][4]);
    }

    static private ArrayList<Square> neighborsEdge (){
        return m.getNeighbors(m.maze[0][1]);
    }

    static private ArrayList<Square> neighborsMiddle (){
        return m.getNeighbors(m.maze[2][2]);
    }
}
