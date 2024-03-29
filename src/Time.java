import java.io.Serializable;
import java.util.Scanner;
public class Time implements Serializable {
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
        System.out.println("Time has been set successfully");
    }

    public void showTime(){
        if(this.hour<10){
            System.out.print("0"+hour);
        } else {
            System.out.print(hour);
        }
        System.out.print(":");
        if(this.minute<10){
            System.out.print("0"+minute);
        } else {
            System.out.print(minute);
        }
    }
}
