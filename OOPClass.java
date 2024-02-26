

public class OOPClass {

  public static class PersonClass {
    String name;
    int age;

    public void setValue(String n, int a) {
      name = n;
      age = a;
    }

    private void printName() {
    
    }
  }


  public static void main(String[] args) {

    PersonClass p1 = new PersonClass(); // create new object p1;
    PersonClass p2 = new PersonClass(); // create new object p2;
    p1.setValue("Hasibul Islam", 15);
    p2.setValue("Rifat Islam", 25);


    System.out.println("---- OOP With Java ----");
    p1.printName();
    p2.printName();



  }
}
