public class FoodClass {

  public static class FoodName {
    int price;
    String name;

    public void setValue(String f, int p) {
      name = f;
      price = p;
      printFood();
    }

    public void printFood() {
      System.out.println(" Name : " + name + " " + "Price :  " + price);
    }
  }


  public static class CFoodName {

    public CFoodName(String f, int p) {
      System.out.println("Auto Called Constructor !!");
      System.out.println(f + " " + p);
    }
  }

  public static void main(String[] args) {
    FoodName f1 = new FoodName();
    f1.setValue("Apple", 550);
    new CFoodName("Apple", 550);

  }
}
