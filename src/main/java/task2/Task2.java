package task2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input n : ");
    int n = scanner.nextInt();

    Queue<Integer> queue1 = IntStream.range(1,n).boxed().collect(
        Collectors.toCollection(ArrayDeque::new));
    Queue<String> queue2 = new ArrayDeque<>();

    ExecutorService executorService = Executors.newFixedThreadPool(5);
    executorService.submit(new ThreadA(queue1,queue2));
    executorService.submit(new ThreadB(queue1,queue2));
    executorService.submit(new ThreadC(queue1,queue2));
    executorService.submit(new ThreadNumber(queue1,queue2));
    executorService.submit(new ThreadD(queue2));

  }

}
