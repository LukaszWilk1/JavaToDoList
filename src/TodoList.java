public class TodoList {
    private String userName;
    public TodoList(String userName){
        this.userName = userName;
    }

    public void showList(){
        System.out.println(userName);
        System.out.println("==========================================================================");
        System.out.println("=                                 Lista                                  =");
    }
}
