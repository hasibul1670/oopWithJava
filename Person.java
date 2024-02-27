public class Person {
  public String name;
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int a) {
    this.age = a;
  }

  public void printPerson() {
    System.out.println(name + " " + age);
  }
}
