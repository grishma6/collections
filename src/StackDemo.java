import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        //To Add
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //To see the list
        System.out.println(stack);

        //To check the size
        System.out.println(stack.size());

        //Remove
        stack.pop();
        System.out.println(stack);

        //To see empty or not
        System.out.println(stack.isEmpty());

        //Returns the top element without deleting
        System.out.println(stack.peek());

        //To search at indexing from 1
        int search = stack.search(2);
        System.out.println(search);

        //LinkedList as Stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addLast(3);
        System.out.println(linkedList);
        linkedList.getLast(); //peek
        linkedList.removeLast(); //pop
        linkedList.size();
        linkedList.isEmpty();

        //ArrayList as Stack? {not with ArrayList}
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.remove(arrayList.size()-1); //pop
        arrayList.get(arrayList.size() - 1); //peep
    }
}
