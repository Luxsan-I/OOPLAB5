import java.util.Objects;

public class MyDoublyLinkedList <T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    //Constructor
    public MyDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Working with doubly linked list, make sure each insert updates .next and .prev

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    //Edge cases: if index <0 or index > size, then throw exception
    public void insertAt(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node<T> newNode = new Node<>(data);

        //Find the node currently at index
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node<T> previous = current.prev;

        //Insert
        newNode.next = current;
        newNode.prev = previous;
        previous.next = newNode;
        current.prev = newNode;

        size++;

    }

    //Return head's data
    //Throw exception if Empty
    public T getFirst() {
        if (head == null) {
            throw new IllegalStateException("The list is empty");
        }
        return head.data;
    }

    public T getLast() {
        if (tail == null) {
            throw new IllegalStateException("The list is empty");
        }
        return tail.data;
    }

    public T getAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;

    }

    //Loop and compare values
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (Objects.equals(current.data, data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(T data) {
        Node<T> current = head;
        int index = 0;

        while (current != null) {
            if (Objects.equals(current.data, data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; //not found
    }

}

