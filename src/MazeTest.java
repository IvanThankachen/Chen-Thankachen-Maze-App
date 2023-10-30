import java.io.File;

public class MazeTest {
    public static void main(String[] args)
    {
        System.out.println("yuh");
        Maze newMaze = new Maze();
        String testMaze = new String("C:\\Users\\afchen\\Athena Chen - Software Engineering\\data-structures\\.github\\Chen-Thankachen-Maze-App\\src\\maze-1");
        newMaze.loadMaze(testMaze);
        System.out.println("yes");
    }
}
