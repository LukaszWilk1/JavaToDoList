public class Task {
    protected boolean isTaskFinished;
    protected Time taskStartTime;
    protected Time taskEndTime;

    public Task(Time taskStartTime, Time taskEndTime){
        this.taskStartTime = taskStartTime;
        this.taskEndTime = taskEndTime;
    }
    public void writeOutTask(int taskId) {}
    public void showTaskInformation() {}

    public void setTime(Time taskStartNewTime, Time taskEndNewTime){
        this.taskStartTime = taskStartNewTime;
        this.taskEndTime = taskEndNewTime;
    }

    public void setIsTaskFinished(){
        this.isTaskFinished = true;
    }
}
