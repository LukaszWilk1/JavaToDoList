import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
        private final String userName;
        private final ArrayList<Task> taskList = new ArrayList<>();
        public TodoList(String userName){
            this.userName = userName;
        }

        public void showMenu() {
            System.out.println(userName);
            System.out.println("==========================================================================");
            System.out.println("|                                 List                                   |");
            System.out.println("|                                                                        |");
            for(Task task : taskList){
                task.writeOutTask();
            }
            System.out.println("==========================================================================");
            System.out.println("|                                                                        |");
            System.out.println("|                             1. Add task                                |");
            System.out.println("|                      2. Mark task as finished                          |");
            System.out.println("|                       3. Change task's hours                           |");
            System.out.println("|                                                                        |");
            System.out.println("==========================================================================");
        }

        public void addTask(){
            Scanner input = new Scanner(System.in);
            int taskId;
            do {
                System.out.println("Choose type of task you want to add");
                System.out.println("1. Shopping");
                taskId = input.nextInt();
                switch (taskId) {
                    case 1:
                        Time startShoppingTime = new Time();
                        startShoppingTime.setTime();
                        Time endShoppingTime = new Time();
                        endShoppingTime.setTime();
                        Shopping shoppingTask = new Shopping(startShoppingTime, endShoppingTime);
                        System.out.println("Task added successfully");
                        taskList.add(shoppingTask);
                        showMenu();
                        break;
                    case 2:
                        Time startCookingTime = new Time();
                        startCookingTime.setTime();
                        Time endCookingTime = new Time();
                        endCookingTime.setTime();
                        Cooking cookingTask = new Cooking(startCookingTime, endCookingTime);
                        System.out.println("Task added successfully");
                        taskList.add(cookingTask);
                        showMenu();
                        break;
                    default:
                        System.out.println("There is no such option!");
                        break;
                }
            }while(taskId != 1 && taskId != 2);

        }
}
