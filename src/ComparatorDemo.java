import java.util.*;

////Comparing Integer based on decreasing order
//class IntegerComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer s1, Integer s2){
//        return s2-s1;
//    }
//}
//
////Comparing String based on longest length
//class StringComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String s1, String s2){
//        return s1.length()-s2.length();
//    }
//}


class Student{
    String name;
    double gpa;

    Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getgpa(){
        return gpa;
    }
}
public class ComparatorDemo {
//    public static void main(String[] args){
//        List<String> words = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));
//        //Comparing based on Lambda (String)
//        words.sort((a,b) -> a.length() - b.length());
//        //words.sort(new StringComparator());
//
//        System.out.println(words);
//
//        //Comparing based on Lambda (Integer)
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
//        //list.sort(new IntegerComparator());
//
//        list.sort((a,b) -> b-a);
//        System.out.println(list);
//    }

    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Grishma", 4.0));
        students.add(new Student("Golla", 3.75));
        students.add(new Student("Janu", 3.5));
        students.add(new Student("Grish", 3.9));

        students.sort((a,b) -> {
            if((a.getgpa() - b.getgpa()) > 0){ //a>b
            return -1;
            }else if((b.getgpa() - a.getgpa()) < 0){//a<b
            return 1;
            }else{
            return 0;
            }
        });

        for(Student student : students){
            System.out.println(student.getName() + ":" + student.getgpa());
        }
    }
}
