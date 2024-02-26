

public class JavaConstructor {

  public static class PersonClass {
    String name;
    int age;

    // constructor Call Automatically when new Object
    // same name as Class Name
    public PersonClass(String n, int a) {
      name = n;
      age = a;
      System.out.println(name + " " + age);
    }
  }


  public static void main(String[] args) {
    System.out.println("---- OOP With Java ---- ");
    new PersonClass("Hasibul Islam", 15);
    new PersonClass("Rifat Islam", 25);



  }
}
