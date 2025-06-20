package TaskSystem;

public class TaskManager {
    private TaskNode head;
    private int size;
    
    public TaskManager() {
        head = null;
        size = 0;
    }
    
    // Add task at the beginning (O(1))
    public void addTaskAtStart(Task task) {
        TaskNode newNode = new TaskNode(task);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    // Add task at the end (O(n))
    public void addTaskAtEnd(Task task) {
        TaskNode newNode = new TaskNode(task);
        
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    
    // Search task by ID (O(n))
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }
    
    // Delete task by ID (O(n))
    public boolean deleteTask(int taskId) {
        if (head == null) return false;
        
        // Special case: delete head
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            size--;
            return true;
        }
        
        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    // Update task status (O(n))
    public boolean updateTaskStatus(int taskId, String newStatus) {
        Task task = searchTask(taskId);
        if (task != null) {
            task.setStatus(newStatus);
            return true;
        }
        return false;
    }
    
    // Traverse all tasks (O(n))
    public void traverseTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
    
    // Get task count (O(1))
    public int getTaskCount() {
        return size;
    }
    
    // Check if list is empty (O(1))
    public boolean isEmpty() {
        return head == null;
    }
}