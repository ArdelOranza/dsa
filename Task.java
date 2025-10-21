package DSA;

public class Task {
    private String task;
    private String deadline;
    private boolean important;
    private boolean done;

    public Task(String task, boolean important, boolean done ,String deadline) {
        this.task = task;
        this.important = false;
        this.done = false;
        this.deadline=deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void displayImportant(){
        if (isImportant()) {
            System.out.println("Task name: "+ task);
            System.out.println("Task Status"+(isDone()?"Finish ":"not done yet"));
        }
    }

    public void displayAll(){
        System.out.println("Task name: "+task);
        System.out.println("Task Status"+(isDone()?"Finish ":"not done yet"));
        System.out.println("Task Deadline: "+ deadline);
    }
}
