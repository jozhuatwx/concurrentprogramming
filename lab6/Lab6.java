package lab6;

public class Lab6 {
  public static void main(String args[]) {
    Chopstick c1 = new Chopstick(1);
    Chopstick c2 = new Chopstick(2);
    Phil sam = new Phil("sam", c1, c2);
    Phil john = new Phil("john", c1, c2);

    sam.start();
    john.start();
  };
};
