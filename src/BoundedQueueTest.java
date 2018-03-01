import static org.junit.Assert.*;

import org.junit.Test;

public class BoundedQueueTest {
	
	
	@Test 
	public void testConstructor() {
		BoundedQueue queue = new BoundedQueue(1);
		BoundedQueue queue1 = new BoundedQueue(1);
		assertEquals(queue.toString(), queue5.toString());
	}
	@Test
	public void testenQueue() {
		BoundedQueue queue = new BoundedQueue(5);
		queue.enQueue(5);
		queue.enQueue(10);
		queue.enQueue(15);
		queue.enQueue(-5);
		assertTrue(queue.isEmpty() == false);
		assertTrue(queue.toString().equals("[5, 10, 15, -5]"));
	}
	@Test
	public void testdeQueue() {
		BoundedQueue queue1 = new BoundedQueue(5);
		queue1.enQueue(5);
		queue1.enQueue(10);
		queue1.enQueue(15);
		queue1.deQueue();
		assertTrue(queue1.isEmpty() == false);
		assertTrue(queue1.toString().equals("[10, 15]"));
	}
	
	@Test
	public void testEmpty() {
		BoundedQueue queue1 = new BoundedQueue(10);
		assertTrue(queue1.isEmpty() == true);
	}
	
	@Test
	public void testisFull() {
		BoundedQueue queue1 = new BoundedQueue(7);
		queue1.enQueue(1);
		queue1.enQueue(2);
		queue1.enQueue(3);
		queue1.enQueue(4);
		queue1.enQueue(0);
		queue1.enQueue(-5);
		queue1.enQueue(200);
		assertTrue(queue1.isFull() == true);

	}
	
	@Test
	public void testtoString() {
		BoundedQueue queue1 = new BoundedQueue(3);
		queue1.enQueue(1);
		queue1.enQueue(2);
		queue1.enQueue(3);
		assertTrue(queue1.toString().equals("[1, 2, 3]"));

	}
	
	

}
