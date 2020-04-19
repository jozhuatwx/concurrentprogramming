package lab1;

public class MyThread extends Thread {
  public void run() {
    System.out.println("Thread...");
    int fac = 1;
    for (int i = 1; i <= 15; i++) {
      fac = fac * 1;
    };
    System.out.println("Factorial of 15 = " + fac);
  };
};
