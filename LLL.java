import java.util.LinkedList;

public class LLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("This");
        list.add("is");
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
