import java.util.ArrayList;

public class PriQueueImpl<T extends Comparable<T>> implements PriQueueInterface<T>{

	private ArrayList<T> items;

	public PriQueueImpl() {
		items = new ArrayList<T>();
	}

  /* (non-Javadoc)
 * @see PriQueueInterface#isEmpty()
 */
@Override
public boolean isEmpty() {
    return items.isEmpty();
  }

  /* (non-Javadoc)
 * @see PriQueueInterface#isFull()
 */
@Override
public boolean isFull() {
    return items.size() == size() + 1;
  }

	/* (non-Javadoc)
	 * @see PriQueueInterface#enqueue(T)
	 */
	@Override
	public void enqueue(T element) {
		items.add(element);
		siftUp();
	}

  /* (non-Javadoc)
 * @see PriQueueInterface#dequeue()
 */
@Override
public T dequeue()
  throws PriQUnderflowException {
    if (items.size() == 0) {
      throw new PriQUnderflowException("Pri Queue is empty");
    }
    if (items.size() == 1) {
      return items.remove(0);
    }
    T hold = items.get(0);
    items.set(0, items.remove(items.size()-1));
    siftDown();
    return hold;
  }

	private void siftUp() {
		int k = items.size() - 1;
		while (k > 0) {
			int p = (k-1)/2;
			T item = items.get(k);
			T parent = items.get(p);
			if (item.compareTo(parent) > 0) {
				items.set(k, parent);
				items.set(p, item);

				k = p;
			} else {
				break;
			}
		}
	}


	private void siftDown() {
		int k = 0;
		int l = 2*k+1;
		while (l < items.size()) {
			int max=l, r=l+1;
			if (r < items.size()) {
				if (items.get(r).compareTo(items.get(l)) > 0) {
					max++;
				}
			}
			if (items.get(k).compareTo(items.get(max)) < 0) {
					T temp = items.get(k);
					items.set(k, items.get(max));
					items.set(max, temp);
					k = max;
					l = 2*k+1;
			} else {
				break;
			}
		}
	}

	public int size() {
		return items.size();
	}

	public String toString() {
		return items.toString();
	}
}
