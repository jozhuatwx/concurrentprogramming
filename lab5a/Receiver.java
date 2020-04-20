package lab5a;

public class Receiver extends Thread {
  Data data;

  public Receiver(Data ob) {
    data = ob;
  };

  public void run() {
    try {
      while (true) {
        synchronized (data) {
          data.wait();
          System.out.println("Received follwing data: " + data.n);
        };
      }
    } catch (Exception e) {
      // ignore
    };
  };
};
