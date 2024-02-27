// making Encapsulation 2 ways
// 01. By grouping a class
// 02. protection from other by Access modifier
// access modifier
// public --> can access
// private --> access only inside class
// protected -->
// internal Protected-->
public class Encapsulation {

  public static void main(String[] args) {
    System.out.println("Encapsulation in Java-->");
    Person p1 = new Person();
    p1.name = "Hasib";
    p1.setAge(45);
    p1.printPerson();

  }
}
