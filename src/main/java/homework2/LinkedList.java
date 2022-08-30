package homework2;

public class LinkedList {

    Node head; // head of list

    /* Linked list Node*/
    static class Node {
        String data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(String d) {
            data = d;
        }
    }

    public static LinkedList insert(LinkedList list, String data) {
        // Create a new node with given data
        Node new_node = new Node(data);


        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.println("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.println(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }


}
