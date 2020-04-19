package lab3;

public class Student extends Thread {
  String name;
  Room room;
  boolean status = false;

  public Student(String n, Room r) {
    this.name = n;
    this.room = r;
  };

  public void run() {
    while (status == false) {
      status = room.access(this);
    };
  };
};
