# Testing

The `List` ADT and a JUnit contract-test suite that runs against every implementation.

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
        Main.java            # demo entry point
    test/
      list/
        ListTest.java          # abstract: the List contract suite
        ArrayListTest.java     # runs the suite against ArrayList
        LinkedListTest.java    # runs the suite against LinkedList
  scripts/
    run.sh                   # compile and run the List demo (list.Main)
    test.sh                  # compile and run every JUnit test
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh list.LinkedListTest` — compiles everything and runs the suite against one implementation only. The class names are listed in the layout above.
- `scripts/run.sh` — compiles everything and runs the `Main` demo.

## Contents

- `list.List<T>` — the List contract: `add`, `remove`, `set`, `get`, `contains`, `indexOf` and `size`.
- `list.ArrayList<T>` and `list.LinkedList<T>` — the array-backed and node-backed implementations the suite runs against.
- `list.ListTest` — the abstract contract-test suite; each concrete implementation has a one-line subclass that says which class to build.
