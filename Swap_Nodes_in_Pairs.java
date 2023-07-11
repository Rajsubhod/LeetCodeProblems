/*
 Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Swap_Nodes_in_Pairs {
    //ListNode Data Type
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      //Printing LinkedList
      public static void print(ListNode head){
          ListNode temp = head;
          while(temp!=null){
              System.out.print(temp.val+" ");
              temp=temp.next;
          }
      }
      //Making LinkedList
      public static ListNode make(int... val){
          if(val.length<=0){
              return new ListNode();
          }
          ListNode node = new ListNode(val[val.length-1]);
          for(int i=val.length-2;i>=0;i--){
              node = new ListNode(val[i],node);
          }
          return node;     
      }
      public static void main(String[] args) {
          ListNode list = make(1,2,3,4);
          print(list);
          System.out.println();
          print((swapPairs(list)));
      }
    private static ListNode swapPairs(ListNode list) {
        if(list==null || list.next==null){
            return list;
        }
        ListNode head = list;
        ListNode tail = list.next;
        head.next=tail.next;
        tail.next=head;
        tail.next.next=swapPairs(head.next);
        return tail;
    }
}
