package Linked_List;

import java.util.*;

public class sum_LL {
    static Node head1;
    static Node head2;
    static Node head3;

    int size1 = 0;
    int size2 = 0;
    int size3 = 0;

    Node tail1;
    Node tail2;
    Node tail3;

    class Node {
        int val;
        Node next;

        Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }

        Node(int value) {
            this.val = value;
        }
    }

    void insBeg1(int value) {
        Node node = new Node(value);
        node.next = head1;
        head1 = node;
        if (tail1 == null) {
            tail1 = head1;
        }
        size1++;
    }

    void insBeg2(int value) {
        Node node = new Node(value);
        node.next = head2;
        head2 = node;
        if (tail2 == null) {
            tail2 = head2;
        }
        size2++;
    }

    void insBeg3(int value) {
        Node node = new Node(value);
        node.next = head3;
        head3 = node;
        if (tail3 == null) {
            tail3 = head3;
        }
        size3++;
    }

    void display1() {
        Node node = head1;
        while (node != null) {
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.println("End");
    }

    void display2() {
        Node node = head2;
        while (node != null) {
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.println("End");
    }

    void display3() {
        Node node3 = head3;
        while (node3 != null) {
            System.out.print(node3.val + "-->");
            node3 = node3.next;
        }
        System.out.println("End");
    }

    void add(Node head1, Node head2) {
        String value1 = "";
        String value2 = "";
        Node node1 = head1;
        Node node2 = head2;

        while (node1 != null) {
            value1 = value1 + node1.val;
            node1 = node1.next;
        }
        while (node2 != null) {
            value2 = value2 + node2.val;
            node2 = node2.next;
        }

        System.out.println(value1);
        System.out.println(value2);

        int value3 = Integer.parseInt(value1);
        int value4 = Integer.parseInt(value2);

        int add = value3 + value4;

        System.out.println(add);

        String s2 = Integer.toString(add);
        
        
        for (int i = 0; i <=  s2.length() - 1; i++) {
            insBeg3(s2.charAt(i) - '0');
        }
    }

    public static void main(String[] args) {
        sum_LL ll = new sum_LL();
        ll.insBeg1(3);
        ll.insBeg1(4);
        ll.insBeg1(2);

        ll.insBeg2(4);
        ll.insBeg2(6);
        ll.insBeg2(5);

        ll.display1();
        ll.display2();

        ll.add(head1, head2);
        ll.display3();
    }
}

