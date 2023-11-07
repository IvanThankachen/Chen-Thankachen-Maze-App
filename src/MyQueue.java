import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue implements QueueADT
{

     private Node first = null;
     private Node last = null;
     int count = 0; 
    public MyQueue()
    {
       

    }
    public void enqueue(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = this.first;
        this.first = newNode;
        count++;

    }

    public Object dequeue()
    {
        if (first == null)
            throw new  NoSuchElementException();
            Object prev = first.data;
            first = first.next;
            count--;
            return prev;
    }

    public Object front()
    {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public int size()
    {
        return count;
    }

    public boolean isEmpty()
    {
        if (count == 0)
            return true;
        else
            return false;
    }

    public void clear()
    {
        first.data = null;
        first.next = last;
        last.data = null;
    }




    static class Node
    {
        public Object data;
        public Node next;
    }
}


