# Testing

The `List` ADT, its `MaxList` extension, and a JUnit contract-test suite that runs against every implementation.

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      list/
        List.java            # the List ADT contract
        ArrayList.java       # array-backed List
        LinkedList.java      # node-backed List
        MaxList.java         # List<Integer> + getMax (cumulative max)
        MaxArrayList.java    # array-based MaxList (parallel max array)
        MaxLinkedList.java   # linked MaxList (per-node maxPointer)
        Main.java            # demo entry point
    test/
      list/
        ListTest.java          # abstract: the List contract suite
        ArrayListTest.java     # runs the suite against ArrayList
        LinkedListTest.java    # runs the suite against LinkedList
        MaxListTest.java       # abstract: adds the getMax tests
        MaxArrayListTest.java  # runs both suites against MaxArrayList
        MaxLinkedListTest.java # runs both suites against MaxLinkedList
  scripts/
    run.sh                   # compile and run the List demo (list.Main)
    test.sh                  # compile and run every JUnit test
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh list.MaxArrayListTest` — compiles everything and runs the suites against one implementation only. Use this while you are working on one `MaxList` and the other is still empty. The class names are listed in the layout above.
- `scripts/run.sh` — compiles everything and runs the `Main` demo.

## What's here

- `list.List<T>` — the List contract: `add`, `remove`, `set`, `get`, `contains`, `indexOf`, `size`, and `isEmpty`.
- `list.ArrayList<T>` and `list.LinkedList<T>` — the array-backed and node-backed implementations the suite runs against.
- `list.MaxList` — a `List<Integer>` with `getMax(index)`, the largest value among positions 0 through `index`.
- `list.MaxArrayList` and `list.MaxLinkedList` — the two `MaxList` implementations: an array with a parallel array of prefix maxima, and a linked list with a `maxPointer` per node.
- `list.ListTest` and `list.MaxListTest` — the abstract contract-test suites; each concrete implementation has a one-line subclass that says which class to build.
