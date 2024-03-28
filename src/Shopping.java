public class Shopping extends Task{
    public Shopping(Time taskStartTime, Time taskEndTime) {
        super(taskStartTime, taskEndTime);
    }

    public void writeOutTask(){
        System.out.println("|                               Shooping                                 |");
    }
}
