public class Task {
    protected boolean isTaskFinished;
    protected Time taskStartTime;
    protected Time taskEndTime;

    public Task(Time taskStartTime, Time taskEndTime){
        this.taskStartTime = taskStartTime;
        this.taskEndTime = taskEndTime;
    }

    public void writeOutTask() {
    }
}
