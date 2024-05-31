public class Main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();

        todoList.addToDo(new Task("Assignment", "First"));
        todoList.addToDo(new Task("Home Work", "Second"));
        todoList.addToDo(new Task("study", "Third"));

        todoList.markToDoCompleted("study");

        todoList.viewToDoList();
    }
}