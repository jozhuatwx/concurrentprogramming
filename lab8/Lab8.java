package lab8;

import java.util.concurrent.Semaphore;

public class Lab8 {
  public static void main(String[] args) {
    Semaphore s = new Semaphore(5);
    Filler f = new Filler(s);
    Sealer se = new Sealer(s);

    f.start();
    se.start();
  };
};
