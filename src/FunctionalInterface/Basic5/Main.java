package FunctionalInterface.Basic5;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Task> tasks = Arrays.asList(
                new Task("Programming", true, 45),
                new Task("Running", true, 20),
                new Task("Scrolling Reels", false, 20),
                new Task("Entertainment", false, 15),
                new Task("Driving", true, 40)
        );
        TaskImpl task = new TaskImpl();
        List<Task> getFilteredTasks = task.getFilteredTask(tasks, Task::isCritical);
        System.out.println("Response - 1");
        getFilteredTasks.forEach(System.out::println);
        getFilteredTasks = task.getFilteredTask(tasks, t -> t.getDurationInMinutes() > 20);
        System.out.println("Response - 2");
        getFilteredTasks.forEach(System.out::println);
        getFilteredTasks = task.getFilteredTask(tasks, t -> t.getName().startsWith("P") || t.getName().startsWith("S"));
        System.out.println("Response - 3");
        getFilteredTasks.forEach(System.out::println);

    }
}
