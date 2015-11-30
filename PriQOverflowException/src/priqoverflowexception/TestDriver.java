
public class TestDriver {

	public static void main(String[] args) {

		WeightedGraph<String> wg = new WeightedGraph<String>(4);
		wg.addVertex("Denver");
		wg.addVertex("LA");
		wg.addVertex("Dallas");
		wg.addVertex("Bangkok");
		//From Denver
		wg.addEdge("Denver", "Denver", 0);
		wg.addEdge("Denver", "LA", 560);
		wg.addEdge("Denver", "Dallas", 1200);
		wg.addEdge("Denver", "Bangkok", 400);
		
		//From LA
		wg.addEdge("LA", "LA", 0);
		wg.addEdge("LA", "Denver", 560);
		wg.addEdge("LA", "Dallas", 800);
		wg.addEdge("LA", "Bangkok", 600);
		
		//From Dallas
		wg.addEdge("Dallas", "Dallas", 0);
		wg.addEdge("Dallas", "Denver", 800);
		wg.addEdge("Dallas", "LA", 760);
		wg.addEdge("Dallas", "Bangkok", 180);
		
		//From Bangkok
		wg.addEdge("Bangkok", "Bangkok", 0);
		wg.addEdge("Bangkok", "Denver", 2000);
		wg.addEdge("Bangkok", "LA", 3000);
		wg.addEdge("Bangkok", "Dallas", 250);
		
		System.out.println("Most Efficient Travel Path from Denver to Dallas is:  " + wg.weightIs("Denver", "Dallas"));
		
		System.out.println("Most Efficient Travel Path from LA to Bangkok is:  " + wg.weightIs("LA", "Bangkok"));
	}

}
