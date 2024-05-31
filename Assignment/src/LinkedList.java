class LinkedList {
    public Node head; // Reference to the first node in the list

    public LinkedList() {
        this.head = null; // Initialize an empty linked list
    }

    // Insert a node at a specified position

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (position == 1) {
            newNode.next = head; // Insert at the beginning
            head = newNode;
        }
        else {
            Node prev = head;
            for (int i = 1; i < position - 1 && prev != null; ++i) {
                prev = prev.next; // Traverse to the previous node
            }
            if (prev != null) {
                newNode.next = prev.next; // Insert after previous
                prev.next = newNode;
            }
        }
    }

    // Delete a node at a specified position

    public void deleteAtPosition(int position) {
        if (position == 1) {
            Node temp = head; // Store the current head
            head = head.next; // Remove the first node
            temp.next = null;
        }
        else {
            Node prev = head;
            for (int i = 1; i < position - 1 && prev != null; ++i) {
                prev = prev.next; // Traverse to the previous node
            }
            if (prev != null && prev.next != null) {
                Node temp = prev.next; // Store the node to be deleted
                prev.next = temp.next; // Remove the node
                temp.next = null;
            }
        }
    }

    // Delete the node after a given node

    public void deleteAfterNode(Node currentNode) {
        if (currentNode != null && currentNode.next != null) {
            Node temp = currentNode.next; // Store the next node
            currentNode.next = temp.next; // Remove the next node
            temp.next = null;
        }
    }

    // Search for a node with a specific valu

    public Node searchNode(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return current; // Found the target node
            }
            current = current.next;
        }
        return null; // Target not found
    }
}