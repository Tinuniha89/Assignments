public class ToDoList {
    private Node head; // Reference to the first node in the linked list

    public ToDoList() {
        this.head = null; // Initialize an empty to-do list
    }

    // Add a new task to the end of the list
    public void addToDo(Task task) {
        Node newNode = new Node(task); // Create a new node with the given task
        if (head == null) {
            head = newNode; // If the list is empty, set the new node as the head
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext(); // Traverse to the last node
            }
            current.setNext(newNode); // Add the new node after the last node
        }
    }

    // Mark a task as completed based on its title
    public void markToDoCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted(); // Mark the task as completed
                return;
            }
            current = current.getNext();
        }
        System.out.println("Task with title '" + title + "' not found.");
    }

    // View the entire to-do list
    public void viewToDoList() {
        if (head == null) {
            System.out.println("ToDo List is empty.");
        } else {
            System.out.println("ToDo List:");
            Node current = head;
            while (current != null) {
                Task task = current.getTask();
                System.out.println(task.getTitle() + " " + task.getDescription() + " " + task.isCompleted());
                current = current.getNext();
            }
        }
    }
}

