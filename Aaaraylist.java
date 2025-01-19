import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Aaaraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(1);

        System.out.println(list);
        list.get(2);
        System.out.println(list.get(2));
        list.set(2 , 3);
        System.out.println(list);

        list.add(3,3);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);

    }
}
