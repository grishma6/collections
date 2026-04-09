import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args){
        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student("Grishma", 25);
        Student s2 = new Student("Golla", 26);
        Student s3 = new Student("Golla", 26);

        map.put(s1, "Engineer");//hashcode1 -->> index1
        map.put(s2, "Software Engineer");//hashcode2 -->> index2
        map.put(s3, "Software EngineerII");//hashcode3 -->> index3

        System.out.println("HashMap Size" + map.size());
        System.out.println("Value of p1: " + map.get(s1));
        System.out.println("Value of p1: " + map.get(s3));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Grishma", 25);//hashcode1 -->> index1
        map1.put("Golla", 26);//hashcode2 -->> index2
        map1.put("Grishma", 27);//hashcode3 -->> equals() -->> replace


    }

    public static class Student{
        private String name;
        private int id;

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public Student(String name, int id){
            this.name = name;
            this.id = id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id); // based on actual fields
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true; // same object
            if (!(obj instanceof Student)) return false; // wrong type
            Student other = (Student) obj;
            return id == other.getId() &&
                    Objects.equals(name, other.getName()); // your logic
        }

        @Override
        public String toString() {
            return "id: " + id + ", name: " + name;
        }
    }
}
