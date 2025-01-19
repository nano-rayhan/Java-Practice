import java.util.Stack;

public class StackProblem {
    public static void pushButtop(int data,  Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top = s.pop();
        pushButtop(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); 

        s.push(1);
        s.push(2);
        s.push(3);

        //pushButtop(4, s);
        s.reversed();

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
