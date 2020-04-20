package lab5a;

public class Lab5a {
  public static void main(String args[]) {
    Data data = new Data();
    Sender s = new Sender(data);
    Receiver r = new Receiver(data);

    s.start();
    r.start();
  };
};
