package LinkedList.SLL;

import java.util.Scanner;

public class Middle {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end
    static Node insert(Node head, Node newNode) {

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Display list
    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Find middle using slow-fast pointer
    static int middleNode(Node head) {

        if (head == null)
            return -1;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt(); // number of nodes

        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();

            Node newNode = new Node(val);

            head = insert(head, newNode);
        }

        display(head);

        int mid = middleNode(head);

        System.out.println("Middle Element: " + mid);
    }
}
