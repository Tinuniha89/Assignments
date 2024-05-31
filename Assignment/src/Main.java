public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();

        list.deleteAtPosition(2);
        current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        Stack stack = new Stack();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(+stack.peek());
    }
}
