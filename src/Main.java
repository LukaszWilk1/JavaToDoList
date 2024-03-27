import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        TodoList todoList = new TodoList(userName);
        todoList.showList();
    }
}