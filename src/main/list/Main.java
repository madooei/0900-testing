package list;

/** A small demo of the List ADT. */
public class Main {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    System.out.println("size: " + list.size());
    System.out.println("get(0): " + list.get(0));
    System.out.println("indexOf(20): " + list.indexOf(20));
    list.remove(20);
    System.out.println("after remove(20), size: " + list.size());
  }
}
