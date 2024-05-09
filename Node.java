import java.util.ArrayList;

public class Node {
    private ArrayList<Node> children;
    public String id;
    public Node(String i){
        id = i;
        children = new ArrayList<Node>();
    }
    public Node(String i, ArrayList<Node> c){
        id = i;
        children = c;
    }
    public ArrayList<Node> getChildren(){
        return children;
    }
    public String getID(){
        return id;
    }
}

