package src;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Test case using the graph here https://en.wikipedia.org/wiki/File:Graph.traversal.example.png
        //Note this program currently doesn't support weights
        Node a = new Node("a", 1);
        Node b = new Node("b", 1);
        Node c = new Node("c", 1);
        Node d = new Node("d", 1);
        Node e = new Node("e", 1);
        Node f = new Node("f", 1);
        Node g = new Node("g", 1);
        a.setChildren(new Node[]{b,c,e});
        b.setChildren(new Node[]{a,d,f});
        c.setChildren(new Node[]{a,g});
        d.setChildren(new Node[]{b});
        e.setChildren(new Node[]{a,f});
        f.setChildren(new Node[]{b,e});
        g.setChildren(new Node[]{c});

        Search search = new Search();
        ArrayList<Node> solution = search.runSearch(a, d);
        for(Node curNode:solution){
            System.out.println(curNode.getID());
        }
    }   
}

