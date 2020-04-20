package lab6;

import java.util.Random;

public class Phil extends Thread {
  Chopstick c1, c2;

  public Phil(String name, Chopstick c1, Chopstick c2) {
    this.setName(name);
    this.c1 = c1;
    this.c2 = c2;
  };

  public void run() {
    try {
      while (true) {
        Thread.sleep(new Random().nextInt(2) * 1000);
        int res1 = c1.take(this);
        Thread.sleep(new Random().nextInt(2) * 1000);
        int res2 = c2.take(this);

        if (res1 == 1 && res2 == 1) {
          System.out.println(this.getName() + " is eating.");
          Thread.sleep(2000);
          c1.put(this);
          c2.put(this);
        } else if (res1 == 0 && res2 == 1) {
          while (res1 == 0)
            res1 = c1.take(this);
          System.out.println(this.getName() + " is eating.");
          Thread.sleep(2000);
          c1.put(this);
          c2.put(this);
        } else if (res2 == 0 && res1 == 1) {
          while (res2 == 0)
            res2=c2.take(this);
          System.out.println(this.getName() + " is eating.");
          Thread.sleep(2000);
          c1.put(this);
          c2.put(this);
        };
      }
    } catch (Exception e) {
      // ignore
    };
  };
};
