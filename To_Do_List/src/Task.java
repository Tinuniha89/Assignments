public class Task {
    private final String title; // The title of the task
    private final String description; // A description of the task
    private boolean completed; // Indicates whether the task is completed

    public Task(String title, String description) {
        this.title = title; // Initialize the title field with the provided title
        this.description = description; // Initialize the description field with the provided description
        this.completed = false; // Initially, the task is not completed
    }

    public String getTitle() {
        return title; // Get the title of the task
    }

    public String getDescription() {
        return description; // Get the description of the task
    }

    public boolean isCompleted() {
        return completed; // Check if the task is completed
    }

    public void markCompleted() {
        completed = true; // Mark the task as completed
    }
}





