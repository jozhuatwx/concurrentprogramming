package lab5b;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Data {
  int n = 0;
  Lock L = new ReentrantLock(); // One lock object. This will be shared to workers

  public void increase() {
    L.lock();
    n++;
  };

  public void display() {
    System.out.println("Value of n = " + n);
    L.unlock();
  };
};
