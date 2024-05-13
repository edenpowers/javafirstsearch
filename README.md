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
Node[] children = new Node[]{x};
Node y = new Node("id",children);
```
getChildren:
```java
Node[] children = x.getChildren();
```
setChildren:
```java
x.setChildren(new Node[] {y});
```
getID:
```java
String id = x.getID();
```
### Graph
New Graph (empty):
```java
Graph graph = new Graph();
```
New Graph (with nodes):
```java
Graph graph = new Graph(new Node[] {x, y});
```
Run search:
```java
//Searches from x to y
Optional<Stack<Node>> path = graph.search(x, y);
```
Print nodes in graph (toString):
```java
System.out.println(graph);
```
### Notes
- The `Optional<T>` type is used to safely store failed searches, in which case the `Optional<T>` will not contain a type. The `Optional<T>` docs are [here](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html).
- The final `Optional<Stack<Node>` is in opposite order of the path. This means the target element is first, and the start element is last.