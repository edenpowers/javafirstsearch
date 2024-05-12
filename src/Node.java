package src;

public class Node {
    private Node[] children;
    private String id;
    private double weight;
    public Node(String i, double w){
        id = i;
        children = new Node[0];
        weight = w;
    }
    public Node(String i, double w, Node[] c){
        id = i;
        children = c;
        weight = w;
    }
    public Node[] getChildren(){
        return children;
    }
    public String getID(){
        return id;
    }
    public double getWeight(){
        return weight;
    }
}

