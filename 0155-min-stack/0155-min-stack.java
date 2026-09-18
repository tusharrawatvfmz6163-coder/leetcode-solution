 import java.util.Stack;

class Pair {
    int value;
    int min;

    Pair(int value, int min) {
        this.value = value;
        this.min = min;
    }
}

class MinStack {

    Stack<Pair> s;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int value) {

        if (s.isEmpty()) {
            s.push(new Pair(value, value));
        } else {
            int min = Math.min(value, s.peek().min);
            s.push(new Pair(value, min));
        }
    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek().value;
    }

    public int getMin() {
        return s.peek().min;
    }
}