package lab5b;

public class Worker extends Thread {
  Data d;

  public Worker(Data dd) {
    d = dd;
  };

  public void run() {
    d.increase();
    try {
      Thread.sleep(2000);
    } catch (Exception e) {
      // ignore
    };
    d.display();
  };
};
