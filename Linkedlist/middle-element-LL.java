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
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    
} // optimal TC:O(n), SC:O(1)

//bruteforce TC:O(n), SC:O(n)
// public ListNode middleNode(ListNode head){
//         ListNode temp=head;
//     int count=0;
//     while(temp!=null){
//         temp=temp.next;
//         count++;
//     }
//     int midindex=count/2;
//     temp=head;
//     while(midindex>0){
//         temp=temp.next;
//         midindex--;
//     }
//     return temp;
// }

