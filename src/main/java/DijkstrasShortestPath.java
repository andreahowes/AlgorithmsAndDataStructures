import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DijkstrasShortestPath {
    public static void main(String[] args) {
        //creating graph:
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        vertexA.addNeighbor(vertexB, 10);
        vertexA.addNeighbor(vertexC, 20);
        vertexB.addNeighbor(vertexC, 5);
        vertexB.addNeighbor(vertexD, 16);
        vertexC.addNeighbor(vertexD, 20);
        Graph graph = new Graph();
        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);
        graph.addVertex(vertexD);
        //find shortest path:
        //method needs to take in graph and the source vertex
        //set the distance of the source vertex as 0
        //create an empty HashSet of vertices with perminent distances
        //create HashSet of vertices with NonPerminent distances and add source vertex
        //while the Hashset of NonPerminent distances is greater than 0:
            //set currentVertexAlgorithmIsOn to the vertex with shortest distance in NonPerminentDistances
            //then remove that from the NonPerminent List
            //then cycle through all neighboringVertices and:
                // get distance from current vertex
                // if the neightbor vertex isn't on the PerminentDistance list:
                    //add to the NonPerminentDistance List






    }
}
//algorithm to find the shortest path between all vertices
//works by finding all paths and picking the shortest one
//
//          10--b--16
//          |   |   |
//          a   5   d
//          |   |   |
//          20--c--20

//class to create the graph
class Graph {
    //graph contains a HashSet that will contain all vertices.
    private Set<Vertex> vertices = new HashSet<>();

    //method to add vertex
    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    //getters and setters needed?
    public Set<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(Set<Vertex> vertices) {
        this.vertices = vertices;
    }
}

// vertex for each point on the graph
class Vertex {
    //each vertex needs a name
    private String name;
    //vertex needs a int to keep track of distance- automatically set to Max Int first
    private Integer distance;
    //each vertex needs a hashmap of neighboring vertices and their distances
    private Map<Vertex, Integer> neighboringVertices = new HashMap<>();
    //method to add neighboring vertex and distance to hashMap
    public void addNeighbor(Vertex vertex, Integer distance){
        neighboringVertices.put(vertex, distance);
    }

    public Map<Vertex, Integer> getNeighboringVertices() {
        return neighboringVertices;
    }

    public void setNeighboringVertices(Map<Vertex, Integer> neighboringVertices) {
        this.neighboringVertices = neighboringVertices;
    }

    //constructor
    public Vertex(String name) {
        this.name = name;
    }

    //getters, setters needed?
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}




