public class Cooking extends Task{
    Cooking(Time taskStartTime, Time taskEndTime){
        super(taskStartTime, taskEndTime);
    }

    public void writeOutTask(){
        System.out.println("|                                Cooking                                 |");
    }
}
