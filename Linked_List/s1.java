package Linked_List;
import java.util.*;
public class s1 {
    static Node head;
    Node tail;
    int size = 0;
    class Node{
        int val;
        Node next;

        public Node(int value){
            this.val = value;
        }
        public Node(int value,Node next){
            this.val = value;
            this.next = next;
        }
    }

    void insBeg(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    void display(){
        Node node = head;

        while(node!=null){
            System.out.print(node.val+"-->");
            node = node.next;
        }
        System.out.println("End");
    }

    void middle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }

    void deleteMiddle(Node header){
        
        Node fast = header;
        Node slow = header;
        Node prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;


    }
    public static void main(String[] args) {
        s1 ss = new s1();

        ss.insBeg(6);
        ss.insBeg(12);
        ss.insBeg(23);
        ss.insBeg(34);
        ss.insBeg(67);
        ss.insBeg(81);
        ss.insBeg(27);
        

        ss.display();

        ss.middle();

        ss.deleteMiddle(head);

        ss.display();
    }
    
}
