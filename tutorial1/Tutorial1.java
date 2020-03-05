public class Tutorial1 {
  public static void main(String args[]) {
    MyThread t = new MyThread();
    t.start(); // t.run() is simply calling a function, not creating a thread
    try {
      Thread.sleep(5000);
    } catch (Exception e) {
      
    }
    System.out.println("Main Thread...");
  }
}
