import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Node f = new Node("f");
        ArrayList<Node> x = new ArrayList<Node>();
        x.add(f);
        Node e = new Node("e",x);
        Node d = new Node("d");
        ArrayList<Node> z = new ArrayList<Node>();
        z.add(f);
        z.add(d);
        Node b = new Node("b",z);
        Node g = new Node("g");
        ArrayList<Node> y = new ArrayList<Node>();
        y.add(g);
        Node c = new Node( "c",y);
        ArrayList<Node> w = new ArrayList<Node>();
        w.add(b);
        w.add(c);
        w.add(e);
        Node a = new Node("a", w);
        Search search = new Search();
        ArrayList<Node> al = search.runSearch(a, d);
        for(Node i:al){
            System.out.println(i.getID());
        }
    }
    
    
}