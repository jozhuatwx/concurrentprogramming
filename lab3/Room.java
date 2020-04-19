package lab3;

public class Room {
  int count = 0;

  public boolean access(Student s) {
    synchronized(this) {
      if (count < 3) {
        count++;
        System.out.println(s.name + " in discussion. Count = " + count);
      } else {
        return (false);
      };
    };

    try {
      Thread.sleep(2000);
    } catch (Exception e) {
      // ignore
    };

    synchronized (this) {
      count--;
      System.out.println(s.name + " left. Count = " + count);
    };

    return (true);
  };
};
