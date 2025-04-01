class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LinkedListAddition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Implement your solution here
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry !=0){
            int x=0,y=0;
            if(l1 != null){
                x=l1.val;
            }
            if(l2 != null){
                y=l2.val;
            }
            int sum = x + y+ carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 =  l2.next;
            }
            
        }
        
        return dummy.next;
        
        
    }
    
    // Helper method to print the list (for testing)
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Test case
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        LinkedListAddition solution = new LinkedListAddition();
        ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result); // Expected: 7 0 8
    }
}
