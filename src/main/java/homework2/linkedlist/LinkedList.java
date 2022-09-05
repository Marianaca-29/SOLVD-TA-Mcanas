package homework2.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<T> {
    private static Logger logger = LogManager.getLogger(LinkedList.class);

    public Node<T> head;


    public void insert(T data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }


    public void insertHead(T data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAt(int index, T data) {
        Node nodeToBeInserted = new Node(data);
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        nodeToBeInserted.setNext(node.getNext());
        node.setNext(nodeToBeInserted);
    }


    public void deleteNodeAt(int index) {
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        node.setNext(node.getNext().getNext());
    }

    public void display() {
        if (head != null) {
            Node currentNode = head;
            while (currentNode != null) {
                logger.info(currentNode.getValue().toString());
                currentNode = currentNode.getNext();
            }
        }
    }


    public int getCount() {
        if (head == null) {
            return 0;
        }
        Node iterator = head;
        int count = 0;

        while (iterator != null) {
            count++;
            iterator = iterator.next;

        }
        return count;

    }

}
