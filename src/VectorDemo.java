import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());

        for(int i=0; i<vector.size(); i++){
            System.out.println(vector.get(i));
        }






    }
}
