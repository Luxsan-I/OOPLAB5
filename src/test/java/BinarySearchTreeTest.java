import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyDoublyLinkedListTest {

    private MyDoublyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new MyDoublyLinkedList<>();
    }
