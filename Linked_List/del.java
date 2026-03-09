package Linked_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public  class del {
   static ListNode head;
    static ListNode tail;
   static int size =0;
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    
     void insBeg(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    void display(){
        ListNode node = head;
        while(node != null){
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.println("End");

    }
    public void deleteNode(ListNode node) {
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        del delete = new del();
       delete.insBeg(9);
        delete.insBeg(1);
        delete.insBeg(5);
        delete.insBeg(4);

        delete.display();

        ListNode del = head;

        delete.deleteNode(del);
        delete.display();
        
    }
}