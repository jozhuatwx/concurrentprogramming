package lab8;

import java.util.concurrent.Semaphore;

public class Sealer extends Thread {
  Semaphore s;
  public Sealer(Semaphore s) {
    this.s = s;
  };

  public void run() {
    try {
      while (true) {
        if (s.availablePermits() == 0) {
          Thread.sleep(2000);
          System.out.println("Sealed all 5 cans");
          s.release(5);
        };
      }
    } catch (Exception e) {};
  };
};
