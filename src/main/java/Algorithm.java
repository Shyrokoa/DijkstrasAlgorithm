import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Algorithm {
    private final List<Vertex> nodes;
    private final List<Edge> edges;
    private Set<Vertex> unvisitedNodes;
    private Set<Vertex> visitedNodes;


    /**
     * This constructor creates a copy of the array so that we can operate on this array
     */
    public Algorithm(Graph graph) {
        this.nodes = new ArrayList<Vertex>(graph.getVertexes());
        this.edges = new ArrayList<Edge>(graph.getEdges());
    }
}
