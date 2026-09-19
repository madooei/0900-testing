package list;

/** Runs the List contract suite against ArrayList. */
public class ArrayListTest extends ListTest {

  @Override
  protected List<Integer> createList() {
    return new ArrayList<>();
  }
}
