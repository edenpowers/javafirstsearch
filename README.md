# Depth First Search
Runs Depth First Search (DFS) using Java
Made for my APCSA class

# Examples
If you want to use this as a library, here are some examples

### Node
Node without children:
```java
Node x = new Node("id");
```
Node with children:
```java
ArrayList<Node> children = new ArrayList<Node>();
Node x = new Node("id",children);
```
getChildren:
```java
ArrayList<Node> children = x.getChildren();
```
getID:
```java
String id = x.getID();
```
### Search
New Search:
```java
Search search = new Search();
```
runSearch:
```java
Node end = new Node("end");
ArrayList<Node> startChildren = new ArrayList<Node>();
startChildren.add(end);
Node start = new Node("start", startChildren);
ArrayList<Node> path = search.runSearch(start, end);
```
### Notes
- Each new `Search` should take place in a new `Search` object, I'll make it so the `runSearch()` method doesn't have side effects in a future version.
- This program only supports tree structures for now, but you can have one `Node` be a child of many other `Node`s
- The final `ArrayList<Node>` is in opposite order of the path. This means the target element is first, and the start element is last.