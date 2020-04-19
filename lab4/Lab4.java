package lab4;

public class Lab4 {
  public static void main(String args[]) {
    Stock s = new Stock();
    Producer p = new Producer(s);
    Consumer c = new Consumer(s);

    p.start();
    c.start();
  };
};
