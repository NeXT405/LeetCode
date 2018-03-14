package bis20;

import bis20.Level2.ListNode;

public class Level21MergeTwoSortedLists {

	/*
	 * Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
	 */
	public static void main(String[] args) {

		// First List
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode four = new ListNode(4);
		one.next = two;
		one.next.next = four;

		// Second List
		ListNode _one = new ListNode(1);
		ListNode three = new ListNode(3);
		ListNode _four = new ListNode(4);
		_one.next = three;
		_one.next.next = _four;

		System.out.println(mergeTwoLists(one, _one));
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode mergeHead;
		if (l1.val < l2.val) {
			mergeHead = l1;
			mergeHead.next = mergeTwoLists(l1.next, l2);
		} else {
			mergeHead = l2;
			mergeHead.next = mergeTwoLists(l1, l2.next);
		}
		return mergeHead;
	}

	public static boolean hasNext(ListNode listNode) {
		if (listNode != null) {
			return true;
		} else {
			return false;
		}
	}
}
