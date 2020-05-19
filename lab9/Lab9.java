package lab9;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Lab9 {
  public static void main(String[] args) {
    Callable c;
    Thread t[] = new Thread[5];
    FutureTask f[] = new FutureTask[5];
    int count = 0;

    for (int i = 0; i < t.length; i++) {
      c = () -> {
        int x = new Random().nextInt(9) * 100;
        try {
          Thread.sleep(x);
        } catch (Exception e) {};
        return x;
      };
      f[i] = new FutureTask(c);
      t[i] = new Thread(f[i]);
      t[i].start();
    };

    while (count < t.length)
      for (int i = 0; i < t.length; i++)
        if (f[i].isDone()) {
          try {
            System.out.println("Results: " + f[i].get());
          } catch (Exception e) {};
          count++;
          break;
        };
  };
};
