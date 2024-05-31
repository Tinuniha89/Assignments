// Implementing a stack using linked lists

class Stack {
    private Node top; // Reference to the top node of the stack

    public Stack() {
        this.top = null; // Initialize an empty stack
    }

    // Push a new element onto the stack

    public void push(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        newNode.next = top; // Set the new node's next reference to the current top
        top = newNode; // Update the top reference to the new node
    }

    // Pop (remove) the top element from the stack

    public void pop() {
        if (top != null) {
            Node temp = top; // Store the current top node
            top = top.next; // Move the top reference to the next node
            temp.next = null; // Disconnect the old top node
        }
    }

    public int peek() {
        return (top != null) ? top.data : -1; // Return -1 if stack is empty
    }
}
