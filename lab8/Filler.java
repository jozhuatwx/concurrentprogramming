package lab8;

import java.util.concurrent.Semaphore;

public class Filler extends Thread {
  Semaphore s;
  public Filler(Semaphore s) {
    this.s = s;
  };

  public void run() {
    try {
      while (true) {
        Thread.sleep(1000);
        s.acquire(1);
        System.out.println("Filled a can");
      }
    } catch (Exception e) {};
  };
};
