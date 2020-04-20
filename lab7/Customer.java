package lab7;

import java.util.Random;

public class Customer extends Thread {
  // number of customers
  int count = 0;

  public void run() {
    try {
      while (true) {
        if (count < 10) {
          // random wait time
          Thread.sleep((new Random().nextInt(5) + 1) * 1000);
          // add a random number of customers without exceeding maximum
          int n = new Random().nextInt(10 - count) + 1;
          count += n;
          System.out.println("+" + n + ". Remaining customers: " + count);
        } else {
          Thread.sleep(1);
        };
      }
    } catch (Exception e) {
      // ignore
    };
  };
};
