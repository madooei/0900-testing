package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * The contract test suite for the List ADT, written against the List interface
 * alone. A concrete subclass supplies createList() to pick the implementation.
 */
public abstract class ListTest {

  private List<Integer> list;

  protected abstract List<Integer> createList();

  @BeforeEach
  public void setup() {
    list = createList();
  }

  @Test
  public void newListIsEmpty() {
    assertEquals(0, list.size());
  }

  @Test
  public void containsFalseOnEmptyList() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeFromEmptyListReturnsFalse() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void getOnEmptyListThrows() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void getBelowRangeThrows() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void setOnEmptyListThrows() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void addGrowsSize() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void addThenGetReturnsElement() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void containsFindsAddedElement() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void containsFalseForMissingElement() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void indexOfMissingElementIsMinusOne() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void getPastEndThrows() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeOnlyElementReturnsTrue() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeOnlyElementLeavesEmpty() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeMissingElementReturnsFalse() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeMissingElementLeavesSizeUnchanged() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void elementsComeBackInOrder() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void setReplacesElement() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void setLeavesSizeUnchanged() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void indexOfReturnsFirstOccurrence() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeShrinksSize() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeFirstElementShiftsTheRest() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeMiddleElementClosesTheGap() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeLastElementKeepsTheRest() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void removeDeletesOnlyTheFirstOccurrence() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void containsStillTrueAfterRemovingOneDuplicate() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void addManyElementsGrowsSize() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Test
  public void addManyElementsKeepsThemInOrder() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
