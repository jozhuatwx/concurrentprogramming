package lab7;

import java.util.Random;

public class Barber extends Thread {
  ShavingKit sk;
  Customer c;

  public Barber(String name, ShavingKit sk, Customer c) {
    this.setName(name);
    this.sk = sk;
    this.c = c;
  };

  public void run() {
    try {
      while (true) {
        if (c.count.get() > 0) {
          // determine customer gets haircut and/or shaving
          int act = (new Random().nextInt(3) + 1);
          // gets haircut
          if (act == 1 || act == 3) {
            // random performing time
            Thread.sleep((new Random().nextInt(2) + 1) * 1000);
            System.out.println(this.getName() + " performed hair cut");
          };
          // gets shaving
          if (act == 2 || act == 3) {
            synchronized (sk) {
              sk.uses(this);
              // random performing time
              Thread.sleep((new Random().nextInt(3) + 1) * 1000);
              sk.returns(this);
            };
          };
          // reduce customer
          c.count.getAndDecrement();
          System.out.println("-1. Remaining customers: " + c.count);
        };
      }
    } catch (Exception e) {
      // ignore
    };
  };
};
