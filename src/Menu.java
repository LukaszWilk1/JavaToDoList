public class Menu {
        private String userName;
        public Menu(String userName){
            this.userName = userName;
        }

        public void showList() {
            System.out.println(userName);
            System.out.println("==========================================================================");
            System.out.println("=                                 Lista                                  =");
        }
}
