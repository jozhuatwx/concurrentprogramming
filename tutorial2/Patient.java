public class Patient extends Thread {
  Doctor doc;
  String name;

  Patient(String name, Doctor doc) {
    this.name = name;
    this.doc = doc;
  }

  public void run() {
    Doctor.consult(name);
  }
}
