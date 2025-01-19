public class ArrayQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rare = -1;

        public Queue() {
                    arr = new int[size];
                    this.size = size;
                }
        
                public static boolean isEmpty(){
                    return rare == -1;
                }
        
                public static void add(int data){
                    if(rare == size -1){
                        System.out.println("Full queue");
                        return;
                    }
        
                    rare ++;
                    arr[rare] = data;
                }
        
                public static int remove(){
                    if(isEmpty()){
                        System.out.println("Empty queue");
                        return -1;
                    }
                    int front = arr[0];
                    for(int i=0 ;i<rare;i++){
                        arr[i] = arr[i+1];
                    }
                    rare--;
                    return front;
        
                }
                public static int peek(){
                    if(isEmpty()){
                        return -1;
                    }
                    return arr[0];
                }
            }
            public static void main(String[] args) {
                Queue q = new Queue();
                q.add(1);
                q.add(2);
                q.add(3);

                while(!q.isEmpty()){
                    System.out.println(q.peek());
                    q.remove();
                }

    }
}
