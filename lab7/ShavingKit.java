package lab7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShavingKit {
  Lock l = new ReentrantLock();

  public void uses(Barber b) {
    // lock using shaving kit
    l.lock();
  };

  public void returns(Barber b) {
    System.out.println(b.getName() + " performed shaving");
    // unlock using shaving kit
    l.unlock();
  };
};
