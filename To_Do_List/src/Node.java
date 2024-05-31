class Node {
    private Task task; // The task associated with this node
    private Node next; // Reference to the next node in the linked structure

    public Node(Task task) {
        this.task = task; // Initialize the task field with the provided task
        this.next = null; // Initially, there is no next node (null reference)
    }

    public Task getTask() {
        return task; // Get the task associated with this node
    }

    public Node getNext() {
        return next; // Get the reference to the next node
    }

    public void setNext(Node next) {
        this.next = next; // Set the reference to the next node
    }
}