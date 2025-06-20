package TaskSystem;

public class Task {
    private int taskId;
    private String taskName;
    private String status; // e.g., "Pending", "In Progress", "Completed"
    
    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = "Pending";
    }
    
    // Getters and Setters
    public int getTaskId() {
        return taskId;
    }
    
    public String getTaskName() {
        return taskName;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return String.format("Task [ID=%d, Name=%s, Status=%s]", 
                           taskId, taskName, status);
    }
}