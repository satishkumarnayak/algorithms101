package algorithms.graphs.DFS;

import org.junit.Before;
import org.junit.Test;

public class GraphTest {

    private Graph1 g;

    @Before
    public void SetUp() throws Exception {
        g = new Graph1(8);
    }

  //  @Test
    public void DepthFirstSearch() throws Exception {

        g.addEdge(0, 1);
        g.addEdge(1, 0);
        g.addEdge(1, 4);
        g.addEdge(4, 1);
        g.addEdge(4, 6);
        g.addEdge(6, 4);
        g.addEdge(6, 0);
        g.addEdge(0, 6);
        g.addEdge(1, 5);
        g.addEdge(5, 1);
        g.addEdge(5, 3);
        g.addEdge(3, 5);
        g.addEdge(3, 0);
        g.addEdge(0, 3);
        g.addEdge(5, 2);
        g.addEdge(2, 5);
        g.addEdge(2, 7);
        g.addEdge(7, 2);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 0)");

        g.DFS(0);
    }
//0 1 5 2 7 3 4 6 
    @Test
    public void DepthFirstSearchDirected() throws Exception {

        g.addEdge(0, 1);
        g.addEdge(1, 4);
        g.addEdge(4, 6);
        g.addEdge(6, 0);
        g.addEdge(1, 5);
        g.addEdge(5, 3);
        g.addEdge(3, 0);
        g.addEdge(5, 2);
        g.addEdge(2, 7);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 0)");

        g.DFS(0);
    }

}
