package Linked_List;
import java.util.*;

public class Loop_LL {
    Stack<Integer> stack = new Stack<>();
    Node head;
    Node tail;
    int size = 0;
    class Node{
        int val;
        Node next;

        Node(int value, Node next){
            this.val = value;
            this.next = next;
        }
        Node(int val){
            this.val = val;
        }
    }

    void insBeg(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        stack.push(value);
        if(tail == null){
            tail = head;
        }
        size++;
    }

    boolean loopCheck(){
        Node node = head;
        while(node.next != null){
            node = node.next;
            if(node.val == head.val){
                return true;
            }
        }
        return false;
    }




    void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        Loop_LL check = new Loop_LL();
        check.insBeg(5);
        check.insBeg(4);
        check.insBeg(3);
        check.insBeg(2);
        check.insBeg(1);
        check.insBeg(3);
        

       
    
       

        System.out.println(check.loopCheck());
        
    }
    
}
