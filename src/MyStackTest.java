public class MyStackTest
{
   
   public static void main (String[] args)
   {
        MyStack<Integer> stack_test = new MyStack<>();
        //Should be 3 4
        stack_test.push(3);
        stack_test.push(4);
        System.out.println(stack_test);

        stack_test.push(5);
        // Should return 5.
        stack_test.top();
        // Should return 3.
        stack_test.size();
        // Should return false.
        stack_test.isEmpty();

        stack_test.pop();
        stack_test.pop();
        stack_test.pop();
        // should return true.
        stack_test.isEmpty();
        //Should be nothing to clear.
        stack_test.clear();

        stack_test.push(2);
        //Should remove 2.
        stack_test.clear();







   }
}
