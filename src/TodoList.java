public class TodoList {
        private final String userName;
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
}
