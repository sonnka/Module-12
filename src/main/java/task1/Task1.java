package task1;

import java.util.Timer;
import java.util.TimerTask;

public class Task1 {

  static int counter = 0;

  public static void main(String[] args){

    Timer timer = new Timer();
    timer.schedule( new TimerTask()
    {
      public void run() {
        counter++;
        System.out.println("Timer: " + counter + "s");
      }
    }, 0, 1000);

    timer.schedule( new TimerTask()
    {
      public void run() {
        System.out.println("Пройшло 5 секунд");
      }
    }, 5000, 5000);

  }

}
