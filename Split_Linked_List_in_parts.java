// Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.

// The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.

// The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.

// Return an array of the k parts.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Split_Linked_List_in_parts {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    //   Printing LinkedList
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
        ListNode list = make(1,2,3);
        int k=5;
        print(list);
        System.out.println();
        System.out.println(splitListToParts(list,k));

    }
    private static ListNode[] splitListToParts(ListNode list, int k) {
        ListNode temp=list;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=list;
        ListNode[] res= new ListNode[k];
        System.out.println(Arrays.toString(res));
        int i=k;
        if(length<=i){
            while(i!=0){
                
                
            }
        }
        return null;
    }
}
