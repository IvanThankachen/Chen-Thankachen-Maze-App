import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{

     private Node first = null;
     private Node last = null;
     int count = 0; 
    public MyQueue()
    {
       

    }
    public void enqueue(T item)
    {
        Node newNode = new Node();
        newNode.data = item;
        if (first == null)
        {
            first = newNode;
            last = newNode;

        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
        count++;

    }

    public T dequeue()
    {
        if (first == null)
            throw new  NoSuchElementException();
        Node newNode = first;
        first = first.next;
        count--;
        return newNode.data;
    }

    public T front()
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
       first = null;
       last = null;
       count = 0;
    }




    private class Node
    {
        public T data;
        public Node next;
    }
}


