package lab4;

public class Consumer extends Thread {
  Stock s;
  public Consumer(Stock s) {
    this.s = s;
  };

  public void run() {
    try {
      while (true) {
        synchronized(s) {
          if (s.count == 0) {
            s.wait();
          };

          Thread.sleep(3000);
          s.count--;
          System.out.println("Consumed 1. Remaining count = " + s.count);
          s.notify();
        };
      }
    } catch (Exception e) {
      // ignore
    };
  };
};
