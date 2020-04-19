package lab1;

public class Lab1 {
  public static void main(String args[]) {
    MyThread t = new MyThread();
    t.start(); // t.run() is simply calling a function, not creating a thread
    try {
      Thread.sleep(5000);
    } catch (Exception e) {
      // ignore
    }
    System.out.println("Main Thread...");
  };
};
