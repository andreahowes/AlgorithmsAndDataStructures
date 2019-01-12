public class DijkstrasShortestPath {
    public static void main(String[] args) {


        //algorithm to find the shortest path between all vertices
        //works by finding all paths and picking the shortest one
//
//          10--b--16
//          |   |   |
//          a   5   d
//          |   |   |
//          20--c--20

        //graph for distances in the above example
        int myGraph[][] = new int[][]{{0, 10, 20, 0}, {10, 0, 5, 16}, {20, 5, 0, 20}, {0, 16, 20, 0}};
        int numberOfVertices = myGraph[0].length;

        //starting the shortest path search at (a)
        int start = 0;


        // this int array will contain the shortest distance from start to current vertex
        int minDistance[] = new int[numberOfVertices];

        //starting the minDistance for each vertice as infinite
        for (int i = 0; i < numberOfVertices; i++) {
            minDistance[i] = Integer.MAX_VALUE;
        }
        //setting min distance for starting point to 0
        minDistance[start]= 0;

        //this boolean array will contain true when the path to that vertex has been finalized
        boolean setDistance[] = new boolean[numberOfVertices];

        //starting the setDistance for each vertex as false
        for (int i = 0; i < numberOfVertices; i++) {
            setDistance[i] = false;
        }

        //finding shortest path method
        //1. pick the min distance vertex from the set of vertices not yet processed- always equal to starting vertex in first iteration
            // -method should have parameters of minDistance[] and setDistance[]
            // -initialize infinite distance for all vertices here?
            // - loop through all setDistance[]
                    // -if value is false (min distance not set)
                    // - and distance is less than current min
                    // - set minimum as that distance and the min vertex as the current vertex
        //2. mark the picked vertex as processed (true)
        //3. update the distance value for the adjacent vertices of the picked vertex
            // -must be false in setDistance (shortest path not yet determined)
            // -must be next to current vertex
            // -must have path through current vertex be smaller than current value of distance


    }


}
