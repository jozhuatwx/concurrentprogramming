package lab2;

public class Lab2 {
  public static void main(String args[]) {
    Doctor doc = new Doctor();

    Patient p1 = new Patient("John", doc);
    Patient p2 = new Patient("Sam", doc);
    Patient p3 = new Patient("Susan", doc);
    Patient p4 = new Patient("Mary", doc);

    p1.start();
    p2.start();
    p3.start();
    p4.start();
  };
};
