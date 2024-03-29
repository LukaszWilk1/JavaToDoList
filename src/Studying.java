public class Studying extends Task{
    public Studying(Time taskStartTime, Time taskEndTime){
        super(taskStartTime, taskEndTime);
    }

    public void writeOutTask(int taskId){
        System.out.printf("|                               %d.Studying                                |\n", taskId);
    }

    public void showTaskInformation(){
        System.out.println("--------------------------------------");
        System.out.print("Task Status: ");
        if(this.isTaskFinished){
            System.out.println("task finished");
        } else {
            System.out.println("task is not finished");
        }
        System.out.println("Task type: Studing");
        System.out.print("Task hours: ");
        this.taskStartTime.showTime();
        System.out.print(" - ");
        this.taskEndTime.showTime();
        System.out.println();
        System.out.println("--------------------------------------");
    }
}
