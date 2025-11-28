import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyDoublyLinkedListTest {

    private MyDoublyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new MyDoublyLinkedList<>();
    }

    @Test
    void testAddFirst() {
        list.addFirst(10);
        assertEquals(10, list.getFirst());
        assertEquals(10, list.getLast());

        list.addFirst(20);
        assertEquals(20, list.getFirst());
        assertEquals(10, list.getLast());
    }

    @Test
    void testAddLast() {
        list.addLast(5);
        assertEquals(5, list.getFirst());
        assertEquals(5, list.getLast());

        list.addLast(15);
        assertEquals(5, list.getFirst());
        assertEquals(15, list.getLast());
    }

    @Test
    void testInsertAt() {
        //insert at head
        list.insertAt(0, 1);
        assertEquals(1, list.getFirst());

        //insert at tail
        list.insertAt(1, 2);
        assertEquals(2, list.getLast());

        //insert in middle
        list.insertAt(1, 3);
        assertEquals(1, list.getAt(0));
        assertEquals(3, list.getAt(1));
        assertEquals(2, list.getAt(2));
    }

    @Test
    void testGetFirstEmpty() {
        assertThrows(IllegalStateException.class, () -> list.getFirst());
    }

    @Test
    void testGetLastEmpty() {
        assertThrows(IllegalStateException.class, () -> list.getLast());
    }

    @Test
    void testGetAt() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        assertEquals(1, list.getAt(0));
        assertEquals(2, list.getAt(1));
        assertEquals(3, list.getAt(2));
        assertThrows(IndexOutOfBoundsException.class, () -> list.getAt(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.getAt(-1));
    }

    @Test
    void testContains() {
        list.addLast(1);
        list.addLast(2);

        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertFalse(list.contains(3));
    }

    @Test
    void testIndexOf() {
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);

        assertEquals(0, list.indexOf(5));
        assertEquals(1, list.indexOf(10));
        assertEquals(2, list.indexOf(15));
        assertEquals(-1, list.indexOf(20));
    }

    @Test
    void testInsertAtInvalidIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.insertAt(-1, 1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.insertAt(1, 1)); // list is empty, max index is 0
    }
}
