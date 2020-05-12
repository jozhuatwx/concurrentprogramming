package lab4;

public class Producer extends Thread {
  Stock s;
  public Producer(Stock s) {
    this.s = s;
  };

  public void run() {
    try {
      while (true) {
        synchronized(s) {
          if (s.count.get() == 5) {
            s.wait();
          };

          Thread.sleep(2000);
          s.count.getAndIncrement();
          System.out.println("Produced 1. Remaining count = " + s.count);
          s.notify();
        };
      }
    } catch (Exception e) {
      // ignore
    };
  };
};
