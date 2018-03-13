package bis20.Level2;

import bis20.Level2.ListNode;

public class Level2AddTwoNumbers {

	/*
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order and each of their nodes
	 * contain a single digit. Add the two numbers and return it as a linked
	 * list.
	 * 
	 * You may assume the two numbers do not contain any leading zero, except
	 * the number 0 itself.
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
	 */
	public static void main(String[] args) {
		// First List
		ListNode two = new ListNode(2);
		ListNode four = new ListNode(4);
		ListNode three = new ListNode(3);
		two.next = four;
		two.next.next = three;
		
		// Second List
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		ListNode _four = new ListNode(4);
		five.next = six;
		five.next.next = _four;
		
		addTwoNumbers(two, five);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode returnNode = new ListNode();
		
		ListNode actualNode1;
		ListNode actualNode2;
		
		do{
	
			actualNode1 = l1;
			actualNode2 = l2;
			
			if(actualNode1.val + actualNode2.val >= 10){
				
			} else {
				returnNode.val = actualNode1.val + actualNode2.val;
			}
			
			
			return returnNode;
		} while(hasNextNode(actualNode1));
						
//		return returnNode;
	}

	public static boolean hasNextNode(ListNode listNode){
		if(listNode != null)
			return true;
		else
			return false;
	}
}

