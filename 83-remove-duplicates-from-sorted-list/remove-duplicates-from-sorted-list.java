class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        
        ListNode left = head;
        
        ListNode right = head.next;

        while (right != null) {
            
            if (right.val == left.val) {
                left.next = right.next; 
            } else {
                left = right; 
            }
           
            right = right.next;
        }

        return head;
    }
}