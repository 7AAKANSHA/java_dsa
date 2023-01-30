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
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;// temp pointer points to head 
        int len=0;// will keep track of len of list
      
      while(temp!=null)// will run till lsit is empty
      {
          temp=temp.next;// move temp to next node
          len++;// increment len of list
      }
      len=(int)Math.ceil(len/2);// find the middle of the list by dividing the length by 2 and rounding up

      for(int i=0;i<len;i++)// after traversing now strat traversing from middle of list 
      {
          head=head.next;// move the head pointer to the next node, effectively traversing the list
      }
      return head;// return the node located at the middle of the list
}
}
