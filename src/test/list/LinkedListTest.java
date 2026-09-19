package list;

/**
 * Runs the full List contract suite against LinkedList. Like ArrayListTest, it
 * overrides only the factory; the entire suite comes from ListTest.
 */
public class LinkedListTest extends ListTest {

  @Override
  protected List<Integer> createList() {
    return new LinkedList<>();
  }
}
