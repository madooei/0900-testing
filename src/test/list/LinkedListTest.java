package list;

/** Runs the List contract suite against LinkedList. */
public class LinkedListTest extends ListTest {

  @Override
  protected List<Integer> createList() {
    return new LinkedList<>();
  }
}
