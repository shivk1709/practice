package FunctionalInterface.Basic5;

import java.util.List;

public class TaskImpl
{
    public List<Task> getFilteredTask(List<Task> tasks, TaskScheduler taskScheduler)
    {
        return tasks.stream().filter(taskScheduler::check).toList();
    }
}
