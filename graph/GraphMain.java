package graph;

public class GraphMain {
    public static void main(String[] args) {
        int noVertices = 5;
        int noEdges = 8;
        GraphLogic graphLogic = new GraphLogic(noVertices, noEdges);

        graphLogic.edge[0] = new Edges(1, 2); 
        graphLogic.edge[1] = new Edges(1, 3); 
        graphLogic.edge[2] = new Edges(1, 4); 
        graphLogic.edge[3] = new Edges(2, 4);  
        graphLogic.edge[4] = new Edges(2, 5); 
        graphLogic.edge[5] = new Edges(3, 4); 
        graphLogic.edge[6] = new Edges(3, 5); 
        graphLogic.edge[7] = new Edges(4, 5); 

        for (int i = 0; i < noEdges; i++) {
            System.out.println(graphLogic.edge[i].src + "," + graphLogic.edge[i].dest);
        }
    }
}



// public class GraphMain {

//     public static void main(String[] args) {
//         int noVertices = 5;
//         GraphLogic graphLogic = new GraphLogic(noVertices);
//         graphLogic.Add[0] = new Edges(1, 2); 
//         graphLogic.Add[1] = new Edges(1, 3); 
//         graphLogic.Add[2] = new Edges(1, 4); 
//         graphLogic.Add[3] = new Edges(2, 4);  
//         graphLogic.Add[4] = new Edges(2, 5); 
//         graphLogic.Add[5] = new Edges(3, 4); 
//         graphLogic.Add[6] = new Edges(3, 5); 
//         graphLogic.Add[7] = new Edges(4, 5); 

//         for (int i = 0; i < noVertices; i++) {
//             System.out.println(graphLogic.Add[i].src + "," + graphLogic.Add[i].dest);
//         }
//     }
// }