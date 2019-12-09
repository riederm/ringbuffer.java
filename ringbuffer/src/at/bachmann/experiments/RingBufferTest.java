package at.bachmann.experiments;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RingBufferTest {

	private RingBuffer ring;

	@Before
	public void init() {
		ring = new RingBuffer(4);
	}

	@Test
	public void anEmptyRingShouldHaveSize0() {
		int size = ring.size();
		Assert.assertEquals(size, 0);
	}

	@Test
	public void itShouldReportTheNumberOfElements() {
		ring.add(1);
		ring.add(2);
		ring.add(5);

		Assert.assertEquals(ring.size(), 3);
	}

	@Test
	public void itShouldNotExceedItsMaximumSize() {
		ring.add(1);
		ring.add(2);
		ring.add(5);
		ring.add(9);

		Assert.assertEquals(ring.size(), 4);

		ring.add(9);
		Assert.assertEquals(ring.size(), 4);

	}
}
