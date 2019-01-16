import java.util.*;

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

        //create an empty hashmap of vertices with permanent distances
        HashSet<Vertex> permanentDistances = new HashSet<>();
        //create hashmap of vertices with NonPerminent distances and add source vertex
        HashSet<Vertex> nonPermanentVertices = new HashSet<>();
        nonPermanentVertices.add(vertexA);
        //while the hashmap of NonPerminent distances is greater than 0:
        while(nonPermanentVertices.size()!=0){
            //set currentVertexAlgorithmIsOn to the vertex with shortest distance in NonPermanentDistances
            //System.out.println(nonPermanentVertices);
            Vertex currentVertex = findSmallestDistanceFromNonPermanents(nonPermanentVertices);
            //then take currentVertex off nonPermanent list
            nonPermanentVertices.remove(currentVertex);

            //then cycle through all neighboringVertices and:
            for(Map.Entry<Vertex, Integer> neighbor: currentVertex.getNeighboringVertices().entrySet()){
                // get distance from current vertex
                Vertex currentNeighbor = neighbor.getKey();
                Integer currentDistance = neighbor.getValue();
                // if the neightbor vertex isn't on the PermanentDistance list:
                if(!permanentDistances.contains(currentNeighbor)){
                    //calculate the min distance between the neighbor and current vertex
                    calculateShortestDistance(currentNeighbor, currentDistance, currentVertex);
                    //add to the NonPermanentDistance List
                    nonPermanentVertices.add(currentNeighbor);
                }

            }
            permanentDistances.add(currentVertex);
        }

    }

    private static Vertex findSmallestDistanceFromNonPermanents(Set<Vertex> nonPermanentVertices) {
        //method for returning vertex with smallest distance from list of NonPermanent vertices
        Vertex smallestDistanceVertex = null;
        int smallestDistance = Integer.MAX_VALUE;
        for (Vertex vertex : nonPermanentVertices) {
            int distance = vertex.getDistance();
            if (distance < smallestDistance) {
                smallestDistance = distance;
                smallestDistanceVertex = vertex;
            }
        }
        return smallestDistanceVertex;

    }

    private static void calculateShortestDistance(Vertex currentNeighbor, Integer currentNeighborDistance, Vertex currentVertex){
        Integer currentVertexDistance = currentVertex.getDistance();
        if(currentVertexDistance + currentNeighborDistance<currentNeighbor.getDistance()){
            currentNeighbor.setDistance(currentVertexDistance + currentNeighborDistance);
            //DO I NEED TO ADD CODE ABOUT CREATING THE SHORTEST PATH? OR IS THE NUMBER ENOUGH?
            LinkedList<Vertex> shortestPath = new LinkedList<Vertex>(currentVertex.getNeighbors());
            shortestPath.add(currentVertex);
            currentNeighbor.setNeighbors(shortestPath);

        }

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
    private List<Vertex> neighbors = new LinkedList<>();
    //each vertex needs a hashmap of neighboring vertices and their distances
    private Map<Vertex, Integer> neighboringVertices = new HashMap<>();

    //constructor
    public Vertex(String name) {
        this.name = name;
    }

    //method to add neighboring vertex and distance to hashMap
    public void addNeighbor(Vertex vertex, Integer distance) {
        neighboringVertices.put(vertex, distance);
    }

    public Map<Vertex, Integer> getNeighboringVertices() {
        return neighboringVertices;
    }

    public void setNeighboringVertices(Map<Vertex, Integer> neighboringVertices) {
        this.neighboringVertices = neighboringVertices;
    }

    //getters, setters needed?

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

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

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", distance=" + distance +'}';

    }
}




