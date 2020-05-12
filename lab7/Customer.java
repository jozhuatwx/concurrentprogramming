package lab7;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer extends Thread {
  // number of customers
  AtomicInteger count = new AtomicInteger(0);

  public void run() {
    try {
      while (true) {
        if (count.get() < 10) {
          // random wait time
          Thread.sleep((new Random().nextInt(5) + 1) * 1000);
          // add a random number of customers without exceeding maximum
          int n = new Random().nextInt(10 - count.get()) + 1;
          count.getAndAdd(n);
          System.out.println("+" + n + ". Remaining customers: " + count.get());
        };
      }
    } catch (Exception e) {
      // ignore
    };
  };
};
