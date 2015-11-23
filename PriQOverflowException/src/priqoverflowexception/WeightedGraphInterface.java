
public interface WeightedGraphInterface<T> {

	void addVertex(T vertex);

	boolean hasVertex(T vertex);

	void addEdge(T fromVertex, T toVertex, int weight);

	int weightIs(T fromVertex, T toVertex);

}