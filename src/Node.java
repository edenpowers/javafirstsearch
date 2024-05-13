package src;

public class Node {
    private Node[] children;
    private String id;
    public Node(String i){
        id = i;
        children = new Node[0];
    }
    public Node(String i, Node[] c){
        id = i;
        children = c;
    }
    public Node[] getChildren(){
        return children;
    }
    public void setChildren(Node[] c){
        children = c;
    }
    public String getID(){
        return id;
    }
}

