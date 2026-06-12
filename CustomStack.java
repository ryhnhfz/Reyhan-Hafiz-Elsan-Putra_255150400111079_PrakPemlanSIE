public class CustomStack {
    Node top;
    int size = 0;

    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        size++;
    }

    public int pop() {
        if (top == null)
            throw new RuntimeException("Stack is empty.");
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }
    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null)
            throw new RuntimeException("Stack is empty.");
        return top.data;
    }

    public static void main(String[] args) {
        CustomStack custom = new CustomStack();
        custom.push(1);
        custom.push(2);
        custom.push(3);
        System.out.print("Custom Stack: ");
        while (!custom.isEmpty()) {
            System.out.print("[" + custom.pop() + "]");
        }
        System.out.println("End.");

        custom.push(1);
        custom.push(2);
        custom.push(3);
        
        System.out.println("Top = " + custom.peek());
        System.out.println("Pop = " + custom.pop());
        System.out.println("Top baru = " + custom.peek());

        CustomStack stack = new CustomStack();
        CustomStack temp = new CustomStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        temp.push(stack.pop());
        temp.push(stack.pop());
        temp.push(stack.pop());

        stack.push(5);

        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        while(!stack.isEmpty()) {
    System.out.print(stack.pop() + " ");
        }
    }
}