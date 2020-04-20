
package lab5b;

public class Lab5b {
  public static void main(String args[]) {
    Data d = new Data();
    Worker w1 = new Worker(d);
    Worker w2 = new Worker(d);
    w1.start();
    w2.start();

    try {
      w1.join();
      w2.join();
    } catch (Exception e) {
      // ignore
    };
    System.out.println("n = " + d.n);
  };
};
