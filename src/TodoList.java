import java.util.ArrayList;
import java.util.Scanner;

public class TodoList <T extends Task> {
        private final String userName;
        private final ArrayList<T> taskList = new ArrayList<>();
        public TodoList(String userName){
            this.userName = userName;
        }

        public void showMenu() {
            Scanner input = new Scanner(System.in);
            int optionNumber;

            do{
                System.out.println(userName);
                System.out.println("==========================================================================");
                System.out.println("|                                 List                                   |");
                System.out.println("|                                                                        |");
                int index = 0;
                for(T task : taskList){
                    index++;
                    task.writeOutTask(index);
                }
                System.out.println("==========================================================================");
                System.out.println("|                                                                        |");
                System.out.println("|                             1. Add task                                |");
                System.out.println("|                      2. Mark task as finished                          |");
                System.out.println("|                         3. Show task details                           |");
                System.out.println("|                       4. Change task's hours                           |");
                System.out.println("|                          5. Close Program                              |");
                System.out.println("|                                                                        |");
                System.out.println("==========================================================================");
                System.out.print("Choose option: ");
                optionNumber = input.nextInt();
                switch (optionNumber){
                    case 1:
                        addTask();
                        break;
                    case 2:
                        markTaskAsFinished();
                        break;
                    case 3:
                        showTaskDetails();
                        break;
                    case 4:
                        changeTime();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("There is no such option!");
                }
            } while(optionNumber != 1 && optionNumber != 2 && optionNumber != 3 && optionNumber != 4);
        }

        public void addTask(){
            Scanner input = new Scanner(System.in);
            int taskId;
            do {
                System.out.println("-----------------------------------------");
                System.out.println("Choose type of task you want to add");
                System.out.println("1. Shopping");
                System.out.println("2. Cooking");
                System.out.println("3. Studying");
                System.out.println("-----------------------------------------");
                taskId = input.nextInt();
                switch (taskId) {
                    case 1:
                        Time startShoppingTime = new Time();
                        startShoppingTime.setTime();
                        Time endShoppingTime = new Time();
                        endShoppingTime.setTime();
                        T shoppingTask = (T) new Shopping(startShoppingTime, endShoppingTime);
                        System.out.println("Task added successfully");
                        taskList.add(shoppingTask);
                        showMenu();
                        break;
                    case 2:
                        Time startCookingTime = new Time();
                        startCookingTime.setTime();
                        Time endCookingTime = new Time();
                        endCookingTime.setTime();
                        T cookingTask = (T) new Cooking(startCookingTime, endCookingTime);
                        System.out.println("Task added successfully");
                        taskList.add(cookingTask);
                        showMenu();
                        break;
                    case 3:
                        Time startStudyingTime = new Time();
                        startStudyingTime.setTime();
                        Time endStudyingTime = new Time();
                        endStudyingTime.setTime();
                        T studyingTask = (T) new Studying(startStudyingTime, endStudyingTime);
                        System.out.println("Task added successfully");
                        taskList.add(studyingTask);
                        showMenu();
                        break;
                    default:
                        System.out.println("There is no such option!");
                        showMenu();
                        break;
                }
            }while(taskId != 1 && taskId != 2);
        }

    public void showTaskDetails() {
        if (taskList.size() > 0) {
            Scanner input = new Scanner(System.in);
            int taskId = 0;
            do {
                System.out.print("Choose task:");
                taskId = input.nextInt();
                if (taskId < 1 || taskId > taskList.size()) {
                    System.out.println("Invalid task number. Please choose a valid task number.");
                } else {
                    taskList.get(taskId - 1).showTaskInformation();
                }
            } while (taskId < 1 || taskId > taskList.size());
            showMenu();
        } else {
            System.out.println("There are no tasks yet!");
            showMenu();
        }
    }

    public void changeTime(){
        if (taskList.size() > 0) {
            Scanner input = new Scanner(System.in);
            int taskId = 0;
            do {
                System.out.print("Choose task:");
                taskId = input.nextInt();
                if (taskId < 1 || taskId > taskList.size()) {
                    System.out.println("Invalid task number. Please choose a valid task number.");
                } else {
                    Time startTaskNewTime = new Time();
                    startTaskNewTime.setTime();
                    Time endTaskNewTime = new Time();
                    endTaskNewTime.setTime();
                    taskList.get(taskId-1).setTime(startTaskNewTime, endTaskNewTime);
                }
            } while (taskId < 1 || taskId > taskList.size());
            showMenu();
        } else {
            System.out.println("There are no tasks yet!");
            showMenu();
        }
    }

    public void markTaskAsFinished(){
        if (taskList.size() > 0) {
            Scanner input = new Scanner(System.in);
            int taskId = 0;
            do {
                System.out.print("Choose task:");
                taskId = input.nextInt();
                if (taskId < 1 || taskId > taskList.size()) {
                    System.out.println("Invalid task number. Please choose a valid task number.");
                } else {
                    taskList.get(taskId-1).setIsTaskFinished();
                }
            } while (taskId < 1 || taskId > taskList.size());
            showMenu();
        } else {
            System.out.println("There are no tasks yet!");
            showMenu();
        }
    }
}
