package lab3;

public class Lab3 {
  public static void main(String args[]) {
    Room r = new Room();
    Student s[] = new Student[5];

    for (int i = 0; i < s.length; i++) {
      s[i] = new Student(String.valueOf(i), r);
    };

    for (int i = 0; i < s.length; i++) {
      s[i].start();
    };
  };
};
