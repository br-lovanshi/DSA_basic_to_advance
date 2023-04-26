import java.util.LinkedList;
import java.util.Queue;

class StackUsingQue {
    Queue<Integer> q;
    int top;

    public StackUsingQue() {
        q = new LinkedList<>();
        top = 0; 
    }
    
    public void push(int x) {
        q.offer(x);
        top = x;
    }
    
    public int pop() {
        int size = q.size();
        while (size > 2) {
            q.offer(q.poll());
            size--;
        }
        top = q.peek();
        q.offer(q.poll());
        return q.poll();
    }
    
    public int top() {
        return this.top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
