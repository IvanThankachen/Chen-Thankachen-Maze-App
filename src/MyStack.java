import java.util.ArrayList;

public class MyStack implements StackADT
{

    private Node first;
    int count = 0;

    public MyStack()
    {
        first = null;
    }


    public void push(Object element)
    {
        Node newNode =  new Node();
        newNode.data = element;
        newNode.next = first;
        this.first = newNode;
        count++;
    }

    public Object pop()
    {
        Object element = this.first.data;
        this.first = this.first.next;
        count--;
        return element;

    }

    public Object top()
    {
        Object element = this.first.data;
        return element;
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
        {
            return false;
        }
    }


    public void clear()
    {
        if (count > 0)
        {
            for (int i = count; count != 0; i--)
            {
                Object element = this.first.data;
                this.first = this.first.next;
                count--;
            }
        }

        else
        {
            System.out.println("There is nothing to clear out!");
        }
    }














    static class Node
    {
        public Object data;
        public Node next;

    }

}









