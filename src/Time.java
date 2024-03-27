import java.util.Scanner;
public class Time {
    private int hour;
    private int minute;

    public void setTime(){
        boolean isHourCorrect;
        boolean isMinuteCorrect;
        do{
            System.out.println("Enter hour:");
            Scanner input = new Scanner(System.in);
            int hour = input.nextInt();
            if(hour > 0 && hour < 25) {
                this.hour = hour;
                isHourCorrect = true;
            }
            else {
                System.out.println("Wrong hour!");
                isHourCorrect = false;
            }
        }while(!isHourCorrect);

        do{
            System.out.println("Enter minute:");
            Scanner input = new Scanner(System.in);
            int minute = input.nextInt();
            if(minute >= 0 && minute < 61)
            {
                this.minute = minute;
                isMinuteCorrect = true;
            }
            else
            {
                System.out.println("Wrong minute!");
                isMinuteCorrect = false;
            }
        }while(!isMinuteCorrect);

    }
}
