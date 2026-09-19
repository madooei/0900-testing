package list;

/** A small demo of the List ADT and its MaxList extension. */
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

    MaxList maxList = new MaxArrayList();
    maxList.add(5);
    maxList.add(7);
    maxList.add(3);
    maxList.add(8);
    System.out.println("getMax over [5, 7, 3, 8]:");
    for (int i = 0; i < maxList.size(); i++) {
      System.out.println("  getMax(" + i + "): " + maxList.getMax(i));
    }
  }
}
