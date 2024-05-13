package src;
import java.util.Optional;
import java.util.Stack;
//import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        //Test case using the graph here https://en.wikipedia.org/wiki/File:Graph.traversal.example.png
        //Note this program currently doesn't support weights
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        a.setChildren(new Node[]{b,c,e});
        b.setChildren(new Node[]{a,d,f});
        c.setChildren(new Node[]{a,g});
        d.setChildren(new Node[]{b});
        e.setChildren(new Node[]{a,f});
        f.setChildren(new Node[]{b,e});
        g.setChildren(new Node[]{c});

        /*
        Search search = new Search();
        ArrayList<Node> solution = search.runSearch(a, d);
        for(Node curNode:solution){
            System.out.println(curNode.getID());
        }
        */

        Graph graph = new Graph(new Node[]{a,b,c,d,e,f,g});
        Optional<Stack<Node>> path = graph.search(f, e);
        if(path.isPresent()){
            for(Node curNode : path.get()){
                System.out.println(curNode.getID());
            }
        } else{
            System.out.println("search failed");
        }
        System.out.println(graph);
        
        Node h = new Node("h");
        graph.setNodes(new Node[]{a,b,c,d,e,f,g,h});
        path = graph.search(a, h);
        if(path.isPresent()){
            for(Node curNode : path.get()){
                System.out.println(curNode.getID());
            }
        } else{
            System.out.println("search failed");
        }
        System.out.println(graph);
    }   
}

