public class Node {
    int data; // The value stored in this node
    Node next; // Reference to the next node in the

    public Node(int data) {
        this.data = data; // Initialize the data field with the provided value
        this.next = null; // Initially, there is no next node (null reference)
    }
}
