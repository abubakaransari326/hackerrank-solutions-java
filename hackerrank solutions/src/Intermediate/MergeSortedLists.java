package Intermediate;

class SinglyLinkedListNode {
  int data;
  SinglyLinkedListNode next;
}


public class MergeSortedLists {
  static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

    SinglyLinkedListNode newList = null;
    SinglyLinkedListNode newListHead = null;
    SinglyLinkedListNode temp = null;
    while (head1 != null && head2 != null) {

      if (head1.data <= head2.data) {
        temp = head1;
        head1 = head1.next;
      } else {
        temp = head2;
        head2 = head2.next;
      }
      if (newList == null) {
        newListHead = temp;
        newList = temp;
      } else {
        newList.next = temp;
        newList = newList.next;
      }
    }

    if (head1 != null)
      temp = head1;
    else
      temp = head2;

    while (temp != null) {
      newList.next = temp;
      newList = newList.next;
      temp = temp.next;
    }
    return newListHead;
  }
}
