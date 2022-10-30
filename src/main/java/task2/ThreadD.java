package task2;

import java.util.Queue;

public class ThreadD extends Thread {

  private final Queue<String> queue2;

  public ThreadD(Queue<String> queue2){
    this.queue2 = queue2;
  }

  public void run() {
    while (true){
      if(!queue2.isEmpty()){
        number();
      }
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private void number(){
    String current = queue2.peek();
    System.out.print(current + " ,");
    queue2.poll();
  }

}
