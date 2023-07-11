/*
    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.
 */

import java.util.Arrays;

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
public class Merge_Two_Sorted_list {
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
        ListNode list1 = make(1,2,4);
        print(list1);
        System.out.println();
        ListNode list2 = make(1,3,4);
        print(list2);
        System.out.println();
        print(mergeTwoLists(list1,list2));
    }
    public static boolean check(ListNode list1,ListNode list2){
        if(list1.val<=list2.val){
            return true;
        }else{
            return false;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) {
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<=list2.val){
            list1.next=mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next=mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
    //Iterative Method --- Bad
    public static ListNode mergeTwoListsI(ListNode temp1, ListNode temp2) {
        ListNode head=new ListNode() ;
        ListNode ans = head;

        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                ListNode temp = new ListNode(temp1.val);
                ans.next = temp;
                ans=temp;
                temp1=temp1.next;
            }else{
                ListNode temp = new ListNode(temp2.val);
                ans.next = temp;
                ans=temp;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
                ListNode temp = new ListNode(temp1.val);
                ans.next = temp;
                ans=temp;
                temp1=temp1.next;
        }
        while(temp2!=null){
                ListNode temp = new ListNode(temp2.val);
                ans.next = temp;
                ans=temp;
                temp2=temp2.next;
        }
        return head.next;
    }
}
