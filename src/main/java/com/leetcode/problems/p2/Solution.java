package com.leetcode.problems.p2;


/**
 * 2. Add Two Numbers
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>
 *<p></p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * */
public class Solution {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = l1.val + l2.val;

        if (sum >= 10) {
            carry = 1;
            sum = sum % 10;
        }

        ListNode resultHead = new ListNode(sum);
        ListNode resultTail = resultHead;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null) {
            sum = l1.val + ((l2 == null) ? 0 : l2.val) + carry;
            carry = 0;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            }

            resultTail.next = new ListNode(sum);
            resultTail = resultTail.next;

            l1 = l1.next;
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        while (l2 != null) {
            sum = l2.val + carry;
            carry = 0;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            }
            resultTail.next = new ListNode(sum);
            resultTail = resultTail.next;
            l2 = l2.next;
        }

        if (carry > 0) {
            resultTail.next = new ListNode(1);
        }

        return resultHead;
    }
}