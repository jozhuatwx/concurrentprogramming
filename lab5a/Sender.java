package lab5a;

import java.util.Random;

public class Sender extends Thread {
  Data data;

  public Sender(Data ob) {
    data = ob;
  };

  public void run() {
    try{
      while (true) {
        Thread.sleep(2000);
        synchronized (data) {
          data.n = new Random().nextInt();
          System.out.println("Sent the follwing data: " + data.n);
          data.notify();
        };
      }
    } catch(Exception e) {
      // ignore
    };
  };
};
