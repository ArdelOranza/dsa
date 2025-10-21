package DSA;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTask {
    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displaMenu();
            System.out.println("Enter a choice ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 5) {
                break;
            }
            choice(choice);
        }
    }

    public static void displaMenu() {
        System.out.println("1.Add Menu");
        System.out.println("2.Remove an item");
        System.out.println("3.Update task");
        System.out.println("4.Display all item ");
        System.out.println("5. Exit the program ");
    }

    public static void choice(int choice) {
        switch (choice) {
            case 1 -> addStudent();
            case 2 -> removeStudent();
            case 3 -> updateStudent();
            case 4 -> displayStudent();
            default -> System.out.println("invalid choice ");
        }
    }

    public static void addStudent() {
        boolean tf;
        System.out.println("Enter the task name");
        String task = scanner.nextLine();

        System.out.println("Enter deadline");
        String deadline = scanner.nextLine();

        System.out.println("is task important(yes/no)");
        String choice = scanner.nextLine();
        tf = choice.equalsIgnoreCase("yes");

        tasks.add(new Task(task, tf, false, deadline));
    }

    public static void removeStudent() {
        System.out.println("enter task you want to remove");
        String taskname = scanner.nextLine();
        tasks.removeIf(e -> e.getTask().equalsIgnoreCase(taskname));
    }

    public static void updateStudent() {
        System.out.println("Enter task name to update");
        String searc = scanner.nextLine();
        Task found = null;
        for (Task task : tasks) {
            if (task.getTask().equalsIgnoreCase(searc)) {
                found = task;
                break;
            }
        }
        if (found == null) {
            return;
        }

        System.out.println("Enter new task name");
        found.setTask(scanner.nextLine());

        System.out.println("Enter new deadline");
        found.setDeadline(scanner.nextLine());

        System.out.println("is task important(yes/no)");
        String choice = scanner.nextLine();
        boolean ch = choice.equalsIgnoreCase("yes");
        found.setImportant(ch);

        System.out.println("is the task done(yes/no)");
        String doneChoice = scanner.nextLine();
        boolean done = doneChoice.equalsIgnoreCase("yes");
        found.setDone(done);
    }

    public static void displayStudent() {
        if (tasks.isEmpty()) {
            System.out.println("Empty Task");
            return;
        }
        System.out.println("do you want to display important task only ");
        String ch = scanner.nextLine().toLowerCase();

        if (ch.equalsIgnoreCase("yes")) {
            for (Task task : tasks) {
                task.displayImportant();
            }
        } else {
            System.out.println("Displaying all");
            for (Task task : tasks) {
                task.displayAll();
            }
        }
    }
}

