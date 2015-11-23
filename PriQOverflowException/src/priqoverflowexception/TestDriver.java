
public class TestDriver {

	public static void main(String[] args) {

		WeightedGraph<String> wg = new WeightedGraph<String>(4);
		wg.addVertex("Washington");
		wg.addVertex("Atlanta");
		wg.addVertex("Dallas");
		wg.addVertex("Chicago");
		//From Washington
		wg.addEdge("Washington", "Washington", 0);
		wg.addEdge("Washington", "Atlanta", 600);
		wg.addEdge("Washington", "Dallas", 1300);
		wg.addEdge("Washington", "Chicago", 300);
		
		//From Atlanta
		wg.addEdge("Atlanta", "Atlanta", 0);
		wg.addEdge("Atlanta", "Washington", 150);
		wg.addEdge("Atlanta", "Dallas", 800);
		wg.addEdge("Atlanta", "Chicago", 600);
		
		//From Dallas
		wg.addEdge("Dallas", "Dallas", 0);
		wg.addEdge("Dallas", "Washington", 60);
		wg.addEdge("Dallas", "Atlanta", 560);
		wg.addEdge("Dallas", "Chicago", 980);
		
		//From Chicago
		wg.addEdge("Chicago", "Chicago", 0);
		wg.addEdge("Chicago", "Washington", 1000);
		wg.addEdge("Chicago", "Atlanta", 300);
		wg.addEdge("Chicago", "Dallas", 250);
		
		System.out.println("Most Efficient Travel Path from Washington to Dallas is:  " + wg.weightIs("Washington", "Dallas"));
		
		System.out.println("Most Efficient Travel Path from Atlanta to Chicago is:  " + wg.weightIs("Atlanta", "Chicago"));
	}

}
