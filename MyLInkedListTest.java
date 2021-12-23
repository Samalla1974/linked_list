package java_linkedlist;

public class MyLInkedListTest {

	MyNode<Integer> myFirstNode = new MyNode<>( key:56);
	MyNode<Integer> mySeondNode = new MyNode<>( key:30);
	MyNode<Integer> myThirdNode = new MyNode<>( key:70);
	MyLinkedList MyLinkedList  = new MyLinkedList();
	MyLinkedLiST.add(myFirstNode);
	MyLinkedLiST.add(mySecondNode);
	MyLinkedLiST.add(myThirdNode);
	MyLinkedLiST.printMyNodes();
	boolean result =  myLinkedList.head.equals(myThirdNode) &&
					  myLinkedList.head.getNext().equals(mySecondNode) &&
					  myLinkedList.tail.equals(myFirstNode);
	Assert.assertTrue(result);
}
