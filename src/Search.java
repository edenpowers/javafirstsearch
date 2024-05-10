package src;
import java.util.ArrayList;

public class Search {
    private ArrayList<Node> discoveredNodes = new ArrayList<Node>();
    
    public Search(){
    }
    public ArrayList<Node> runSearch(Node current, Node target){
        if(current.equals(target)){
            ArrayList<Node> x = new ArrayList<Node>();
            x.add(current);
            return x;
        }
        discoveredNodes.add(current);
        for(Node x: current.getChildren()){
            boolean alr_checked = false;
            for(Node y: discoveredNodes){
                if(y.equals(x)){
                    alr_checked = true;
                }
            }
            if(!alr_checked){
                ArrayList<Node> temp = runSearch(x, target);
                if(temp != null){
                    temp.add(current);
                    return temp;
                } 
            }
        }
        return null;
    }
}
