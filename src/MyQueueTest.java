public class MyQueueTest
{
    public static void main(String args[])
    {
        MyQueue test = new MyQueue();
        System.out.println(test.isEmpty()); // return true.
        test.enqueue(3);
        test.enqueue(4);
        System.out.println(test.front());
        System.out.println(test.size());
        System.out.println(test.isEmpty());
        test.dequeue();
        System.out.println(test.size());
        System.out.println(test.front());
        test.clear();
        System.out.println(test.size());
    }
}