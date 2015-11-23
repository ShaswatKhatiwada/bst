
public interface PriQueueInterface<T extends Comparable<T>> {

	boolean isEmpty();

	boolean isFull();

	void enqueue(T element);

	T dequeue() throws PriQUnderflowException;

}