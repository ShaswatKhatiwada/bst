
/**
 *
 * @author Shaswat
 * @param <T>
 */
public class WeightedGraph<T> implements WeightedGraphInterface<T> {

    /**
     *
     */
    public static final int NULL_EDGE = 0;
    private static final int DEFCAP = 50;
    private int numVertices;
    private int maxVertices;
    private T[] vertices;
    private int[][] edges;
    private boolean[] marks;

    /**
     *
     */
    public WeightedGraph() {
        numVertices = 0;
        maxVertices = DEFCAP;
        vertices = (T[]) new Object[DEFCAP];
        marks = new boolean[DEFCAP];
        edges = new int[DEFCAP][DEFCAP];
    }

    /**
     *
     * @param maxV
     */
    public WeightedGraph(int maxV) {
        numVertices = 0;
        maxVertices = maxV;
        vertices = (T[]) new Object[maxV];
        marks = new boolean[maxV];
        edges = new int[maxV][maxV];
    }

    /**
     *
     * @param vertex
     */
    public void addVertex(T vertex) {

        vertices[numVertices] = vertex;
        for (int index = 0; index < numVertices; index++) {
            edges[numVertices][index] = NULL_EDGE;
            edges[index][numVertices] = NULL_EDGE;
        }
        numVertices++;
    }

    /**
     *
     * @param vertex
     * @return
     */
    public boolean hasVertex(T vertex) {
        boolean flag = false;
        for (int index = 0; index < numVertices; index++) {
            if (vertices[numVertices] == vertex) {
                flag = true;
            }
        }
        return flag;
    }

    private int indexIs(T vertex) {
        int index = 0;
        while (!vertex.equals(vertices[index])) {
            index++;
        }
        return index;
    }

    /**
     *
     * @param fromVertex
     * @param toVertex
     * @param weight
     */
    public void addEdge(T fromVertex, T toVertex, int weight) {
        int row;
        int column;

        row = indexIs(fromVertex);
        column = indexIs(toVertex);
        edges[row][column] = weight;
    }

    /**
     *
     * @param fromVertex
     * @param toVertex
     * @return
     */
    public int weightIs(T fromVertex, T toVertex) {
        int row;
        int column;

        row = indexIs(fromVertex);
        column = indexIs(toVertex);
        return edges[row][column];
    }

}
