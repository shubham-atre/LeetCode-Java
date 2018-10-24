package medium;

/**
 * Author:
 * Shubham Atre
 * shubham.atre94@gmail.com
 * https://github.com/shubham-atre
 * https://leetcode.com/shubhamastu/
 * https://linkedin.com/in/shubhamastu/
 * <p>
 * <p>
 * -------------------------------------------------------
 * https://leetcode.com/problems/add-two-numbers/
 * -------------------------------------------------------

 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example:

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.

 */
public class AddTwoNumbers {

    //Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
         ListNode(int x) { val = x; }
      }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode next = null;
        int carry = 0;
        boolean first = true;

        while(l1 != null && l2!=null)
        {
            if(first)
            {
                result = new ListNode(0);
                next = result;
                first =false;
            }
            else
            {
                next.next = new ListNode(0);
                next = next.next;
            }
            next.val = l1.val + l2.val+carry;
            carry = 0;
            if(next.val>9)
            {
                next.val= next.val-10;
                carry =1;
            }
            l1 = l1.next;
            l2 = l2.next;

        }

        if(l1 !=null)
        {
            while(l1 != null)
            {
                next.next = new ListNode(0);
                next = next.next;
                next.val = l1.val +carry;
                carry = 0;
                if(next.val>9)
                {
                    next.val= next.val-10;
                    carry =1;
                }
                l1 = l1.next;

            }
        }
        else if(l2 !=null)
        {
            while(l2 != null)
            {
                next.next = new ListNode(0);
                next = next.next;
                next.val = l2.val+carry;
                carry = 0;
                if(next.val>9)
                {
                    next.val= next.val-10;
                    carry =1;
                }
                l2 = l2.next;
            }
        }

        if(carry==1)
        {
            next.next = new ListNode(0);
            next = next.next;
            next.val =1;
        }
        return result;
    }

    }
