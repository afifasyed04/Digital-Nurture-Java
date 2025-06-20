package TaskSystem;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        
        // Add tasks
        manager.addTaskAtEnd(new Task(101, "Implement login feature"));
        manager.addTaskAtEnd(new Task(102, "Design database schema"));
        manager.addTaskAtStart(new Task(103, "Create project plan"));
        manager.addTaskAtEnd(new Task(104, "Write unit tests"));
        
        // Display all tasks
        System.out.println("All Tasks:");
        manager.traverseTasks();
        System.out.println();
        
        // Search task
        System.out.println("Searching for task 102:");
        Task task102 = manager.searchTask(102);
        System.out.println(task102 != null ? task102 : "Task not found");
        System.out.println();
        
        // Update task status
        System.out.println("Updating status of task 101:");
        manager.updateTaskStatus(101, "In Progress");
        System.out.println(manager.searchTask(101));
        System.out.println();
        
        // Delete task
        System.out.println("Deleting task 103:");
        boolean deleted = manager.deleteTask(103);
        System.out.println(deleted ? "Successfully deleted" : "Task not found");
        System.out.println();
        
        // Display remaining tasks
        System.out.println("Remaining Tasks (" + manager.getTaskCount() + "):");
        manager.traverseTasks();
    }
}