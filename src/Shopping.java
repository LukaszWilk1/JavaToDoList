public class Shopping extends Task{
    public Shopping(Time taskStartTime, Time taskEndTime) {
        super(taskStartTime, taskEndTime);
    }

    public void writeOutTask(int taskId){
        System.out.printf("|                              %d.Shooping                                |\n", taskId);
    }

    public void showTaskInformation(){
        System.out.println("--------------------------------------");
        System.out.print("Task Status: ");
        if(this.isTaskFinished){
            System.out.println("task finished");
        } else {
            System.out.println("task is not finished");
        }
        System.out.println("Task type: Shopping");
        System.out.print("Task hours: ");
        this.taskStartTime.showTime();
        System.out.print(" - ");
        this.taskEndTime.showTime();
        System.out.println();
        System.out.println("--------------------------------------");
    }
}
