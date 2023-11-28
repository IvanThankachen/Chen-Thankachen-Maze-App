import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyStack<T> implements StackADT<T>
{
     ArrayList<T> stackie;

     public MyStack()
     {
        stackie = new ArrayList<>();
     }

     public void push(T item)
     {
        stackie.add(item);
     }

     public T pop()
     {
        if(stackie.size() == 0)
            throw new NoSuchElementException();
        else
        {
            return stackie.remove(stackie.size()-1);
        }
     }

     public T top()
     {
         if(stackie.size() == 0)
            throw new NoSuchElementException();
        else
        {
            return stackie.get(stackie.size()-1);
        }
     }

     public int size()
     {
        return stackie.size();
     }

     public boolean isEmpty()
     {
        if(stackie.size() == 0)
            return true;
        else
            return false;
     }

     public void clear()
     {
        stackie = new ArrayList<T>();
     }

}









