package at.bachmann.experiments;

public class RingBuffer {

	int[] number;
	int index = 0;
	int size = 0;
	int maxSize = 0;

	public RingBuffer(int maxRingSize) {
		number = new int[maxRingSize];
		maxSize = maxRingSize;
	}

	/**
	 * adds the current element into the ring
	 * 
	 * @param the element to add into the ring
	 */
	public void add(Integer element) {
		if (index < maxSize) {
			number[index] = element;
			index++;
			size++;
		} else {
			index = 0;
		}
	}

	/**
	 * @return removes the oldest element from the ring and returns it
	 */
	public Integer removeOldest() {
		return null;
	}

	/**
	 * @return the number of elements currently stored in the ring
	 */
	public int size() {
		return size;
	}

}
