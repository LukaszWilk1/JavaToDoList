import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
        private final String userName;
        private ArrayList<Task> taskList = new ArrayList<>();
        public TodoList(String userName){
            this.userName = userName;
        }

        public void showMenu() {
            System.out.println(userName);
            System.out.println("==========================================================================");
            System.out.println("|                                 Lista                                  |");
            System.out.println("==========================================================================");
            System.out.println("|                                                                        |");
            System.out.println("|                           1. Dodaj zadanie                             |");
            System.out.println("|                       2. Oznacz jako zrobione                          |");
            System.out.println("|                           3. Zmien godziny                             |");
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
                        Time startTaskTime = new Time();
                        startTaskTime.setTime();
                        Time endTaskTime = new Time();
                        endTaskTime.setTime();
                        Shopping shoppingTask = new Shopping(startTaskTime, endTaskTime);
                        System.out.println("Task added successfully");
                        taskList.add(shoppingTask);
                        showMenu();
                        break;
                    default:
                        System.out.println("There is no such option!");
                        break;
                }
            }while(taskId<0 && taskId >1);

        }
}
