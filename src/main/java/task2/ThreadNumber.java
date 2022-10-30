package task2;

import static java.lang.Thread.sleep;

import java.util.Queue;

public class ThreadNumber implements Runnable {

  private final Queue<Integer> queue1;
  private final Queue<String> queue2;

  public ThreadNumber(Queue<Integer> queue1, Queue<String> queue2) {
    this.queue1 = queue1;
    this.queue2 = queue2;
  }

  public void run() {
    while (true) {
      if (!queue1.isEmpty()) {
        int current = queue1.peek();
        if (current % 3 != 0 && current % 5 != 0) {
          queue2.add(String.valueOf(current));
          queue1.remove(current);
        }
      }
        try {
          sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
}
