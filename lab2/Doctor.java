package lab2;

public class Doctor {
  synchronized public static void consult(String name) {
    System.out.println(name + " consulting the doctor");
    try {
      Thread.sleep(2000);
    } catch (Exception ex) {
      // ignore
    };
    System.out.println(name + " left the room");
  };
};
