package lab7;

public class Lab7 {
  public static void main(String args[]) {
    ShavingKit sk = new ShavingKit();

    Customer c = new Customer();
    Barber sam = new Barber("Sam", sk, c);
    Barber john = new Barber("John", sk, c);

    c.start();
    john.start();
    sam.start();
  };
};
