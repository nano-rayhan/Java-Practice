public class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
     class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public  void addFirst(String data){
        Node newnNode = new Node(data);

        
            if(head == null){
            head = newnNode;
            return;
        }
       
        newnNode.next = head;
        head = newnNode;
        
    }

    public void addLast(String data){
        Node newnNode = new Node(data);
        
        if(head == null){
            head = newnNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnNode;
        
    }

     public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
            
        }

        secondLast.next = null; 
    }

    public int getsize(){
        return size;
    }

    public void reverseIterate(){
        if(head == null || head.next ==null ){
            return;
        }
        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode = preNode;
        
            //update
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }



    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList(); 
        list.deleteFirst();
        list.printList();
        //System.err.println(list.getsize());
        list.reverseIterate();
        System.err.println(list);

    }
}