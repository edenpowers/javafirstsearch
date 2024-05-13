package src;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Stack;
public class Graph {
    Node[] nodes;
    public Graph(){
        nodes = new Node[0];
    }
    public Graph(Node[] nodes){
        this.nodes = nodes;
    }
    public Optional<Stack<Node>> search(Node current, Node target){
        return search(current, target, new ArrayList<Node>());
    }
    public void setNodes(Node[] n){
        nodes = n;
    }
    private Optional<Stack<Node>> search(
        Node current, Node target, ArrayList<Node> discovered
    ){
        if(current.equals(target)){
            Stack<Node> temp = new Stack<Node>();
            temp.push(current);
            return Optional.of(temp);
        }
        discovered.add(current);
        for(Node x : current.getChildren()){
            boolean alr_checked = false;
            for(Node y: discovered){
                if(y.equals(x)){
                    alr_checked = true;
                }
            }
            if(!alr_checked){
                Optional<Stack<Node>> temp = search(x,target,discovered);
                if(temp.isPresent()){
                    temp.get().push(current);
                    return temp;
                }
            }
        }
        return Optional.empty();
    }
    public String toString(){
        String str = "Graph with nodes: ";
        for(Node x : nodes){
            str += x.getID() + ", ";
        }
        return str;
    }
}
