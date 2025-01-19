import java.util.Stack;

public class StackJva {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
