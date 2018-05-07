import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class Prova {

	public static void main(String[] args) {

		Graph<String,DefaultEdge> graph = new SimpleGraph<>(DefaultEdge.class);
		
		graph.addVertex("v");
		graph.addVertex("r");
		graph.addVertex("s");
		graph.addVertex("w");
		
		graph.addEdge("v", "r");
		graph.addEdge("r", "s");
		graph.addEdge("s", "w");
		
		System.out.println(graph);
		
	}

}
