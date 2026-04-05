import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = new ArrayList<>(Arrays.asList("Grishma", "Golla"));
        System.out.println(list1);

        //Adds at the end
        list.add(1);
        list.add(3);
        list.add(100);

        //Adding All
        List<Integer> list2 = List.of(1,2,3,4,5);
        list.addAll(list2);

        //Removing with index with value #(2)
        list.remove(Integer.valueOf(2));
        System.out.println(list);

        //Sorting ArrayList
        Collections.sort(list);
        System.out.println(list);

        //Adding
        //list.add(2, 50);

        //To replace
        //list.set(2, 50);

//        //to print list
//        System.out.println(list);
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

        //Converting list to Array


    }
}
