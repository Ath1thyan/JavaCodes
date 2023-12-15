package graph;

//import java.util.ArrayList;

public class GraphLogic {
    int vertices, edges;
    Edges[] edge;

    GraphLogic(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;
        edge = new Edges[edges];
        for (int i = 0; i < edges; i++) {
            edge[i] = new Edges(0, 0);
        }
    }
    // void fun(int ...o){

    // }
}

// public class GraphLogic {

//     public final Edges[] Add = null;
//     ArrayList <Edges> edge = new ArrayList<Edges>();
//     int vertices;

//     public GraphLogic(int noVertices) {
//     }

//     void Add(int vertices){
//         this.vertices = vertices;
//         for (int i = 0; i < edge.size(); i++) {
//             edge.add(new Edges(0, 0));
//          }
//     }
// }
