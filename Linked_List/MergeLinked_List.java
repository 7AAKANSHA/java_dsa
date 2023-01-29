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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode merg_list= new ListNode();// creating new List to hold elements after merging them
        ListNode tail = merg_list;// creating tail node for insering them to new list

        while(l1 != null && l2!=null)// loop will run until one of the lists becomes empty
        {
            if(l1.val<l2.val)// if list1 value is lesser than lsit2 value then
            {
                tail.next=l1;// move tail towards list1 value 
                l1=l1.next;// store it in new list 
                tail=tail.next;// move tail to next one on list
            }
            else// is list2 has lesser elemnt than list1 then
            {
                tail.next=l2;// move tail pointer to list2 elemnt 
                l2=l2.next;// to store them and keep traversing list2 
                tail=tail.next;// move to tail to next pointer 
            }
        }
        tail.next = (l1!=null)?l1:l2;// the tail pointer is moved to the remaining elements of the non-empty input list, and added to the new list. 
        return merg_list.next; //returning the merged list after removing the dummy node
    }
}
