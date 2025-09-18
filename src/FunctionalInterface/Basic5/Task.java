package FunctionalInterface.Basic5;

public class Task
{
    private String name;
    private boolean isCritical;
    private int durationInMinutes;

    @Override
    public String toString()
    {
        return "Task{" +
                "name='" + name + '\'' +
                ", isCritical=" + isCritical +
                ", durationInMinutes=" + durationInMinutes +
                '}';
    }

    public Task(String name, boolean isCritical, int durationInMinutes)
    {
        this.name = name;
        this.isCritical = isCritical;
        this.durationInMinutes = durationInMinutes;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getDurationInMinutes()
    {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes)
    {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isCritical()
    {
        return isCritical;
    }

    public void setCritical(boolean critical)
    {
        isCritical = critical;
    }
}
