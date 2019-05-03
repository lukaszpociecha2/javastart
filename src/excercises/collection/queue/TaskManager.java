package excercises.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

    private static Queue<Task> tasks = new PriorityQueue<>();
    private static Scanner scanner = new Scanner(System.in);


    public void controlLoop() {

        int option = -1;
        while (option != 3) {
            System.out.println("Wybierz opcje");
            System.out.println("1 - dodaj zadanie, 2 - następne zadanie, 3 - wyjscie");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 3:
                    System.out.println("Do widzenia");
                    scanner.close();
                    break;
                case 1:
                    addTask(createTask());
                    break;
                case 2:

                    Task task = getNextTask();
                    if(task!=null) {
                        System.out.println(task.toString());
                    } else System.out.println("Nie ma więcej zadań");
                    break;
                default:
                    System.out.println("Niepoprawny wybór");
                    break;
            }
        }

    }

    private static void addTask(Task task) {
        tasks.offer(task);
    }

    private Task getNextTask() {
        if(tasks.peek()!=null) {
            return tasks.poll();
        } else

            return null;
    }

    private Task createTask() {

        Task.Priority priority = readPriority();
        System.out.println("Podaj nazwę zadania");
        String taskName = scanner.nextLine();
        System.out.println("Podaj treść zadania");
        String taskDesc = scanner.nextLine();


        return new Task(taskName, taskDesc, priority);
    }

    private Task.Priority readPriority() {

        Task.Priority taskPriority = null;
        while (taskPriority == null) {
            System.out.println("Podaj priorytet zadania: ");
            printPriorities();
            String userChoice = scanner.nextLine();

            for (Task.Priority value : Task.Priority.values()) {
                if (value.name().equalsIgnoreCase(userChoice)) {
                    taskPriority = value;
                }
            }
        }
        return taskPriority;
    }

    public void printPriorities() {
        for (Task.Priority value : Task.Priority.values()) {
            System.out.print(value.name() + " ");
        }
    }


}
