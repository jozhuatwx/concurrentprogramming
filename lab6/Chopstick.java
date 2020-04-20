package lab6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
  Lock loc = new ReentrantLock();
  int id;      // the chopstick number - 1 or 2
  boolean r;   // to store the result of trylock
  
  public Chopstick(int id) {
    this.id = id;
  };

  public int take(Phil p) {
    r = loc.tryLock();
    if (r) {
      System.out.println(p.getName() + " took chopstick " + id);
      return 1;
    };
    return 0;
  };

  public void put(Phil p) {
    System.out.println(p.getName() + " put chopstick " + id);
    loc.unlock();
  };
};
