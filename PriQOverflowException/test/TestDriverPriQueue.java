public class TestDriverPriQueue {

	public static void main(String[] args) {
		PriQueueInterface<Integer> pq = new PriQueueImpl<Integer>();
		pq.enqueue(23);
		pq.enqueue(12);
		pq.enqueue(13);
		pq.enqueue(1);
		pq.enqueue(34);
		pq.enqueue(45);
		pq.enqueue(22);
		pq.enqueue(56);
		pq.enqueue(17);
		pq.enqueue(44);
		pq.enqueue(29);

		while (!pq.isEmpty()) {
			int max = pq.dequeue();
			System.out.println(max + " " + pq);
		}
	}

}
