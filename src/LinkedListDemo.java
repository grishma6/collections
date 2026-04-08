import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);
        linkedList.addFirst(0);
        linkedList.addLast(4);

        System.out.println(linkedList);
        System.out.println(linkedList.get(3)); //index starts with 0

        linkedList.removeIf(x -> x%2==0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog", "Cat", "Pig", "Ant", "Mice"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat", "Pig"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
