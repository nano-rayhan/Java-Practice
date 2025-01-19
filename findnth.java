import java.util.LinkedList;

public class findnth {
    public static list ramoventh(list head, int n){
            if(head.next == null){
                return null;
            }
            int size = 0;
            list curr = head;
            while (curr != null) {
                curr = (list) curr.next;
                size++;
                
            }
            System.out.println(size);
            return head;
            
        }
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
    
            list.add(3);
            list.add(2);
            list.add(7);
            list.add(1);
            list.add(6);
    
            ramoventh( null, 3);
        
        
    }
}
