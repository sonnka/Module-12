package task2;

import java.util.Queue;

public class ThreadB extends Thread {

  private final Queue<Integer> queue1;
  private final Queue<String> queue2;

  public ThreadB(Queue<Integer> queue1, Queue<String> queue2){
    this.queue1 = queue1;
    this.queue2 = queue2;
  }

  public void run() {
    while (true){
      if(!queue1.isEmpty()){
        buzz();
      }
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private void buzz(){
    int current = queue1.peek();
    if(current % 5 == 0 && current % 3 != 0){
      queue1.remove(current);
      queue2.add("buzz");
    }
  }
}
