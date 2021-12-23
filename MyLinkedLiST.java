package java_linkedlist;

public class MyLinkedLiST {
private INode head;
private INode tail;


public MyLinkedList() {
	this.head = null;
	this.tail = null;

public void add (INode MyNode) {
	if (this.tail ==  null) {
	this.tail = newNode;
	}
	if(this.head == my) {
	this.head = newNode;	
	} else {
	this.head = newNode;
	this.head.setNext((tempNode));

}
	
}

public void printMyNodes() {
	StringBuffer myNodes = new StringBuffer("My Nodes: ");
	INode tempNode = head;
	while (tempNode.getNext() != null) {
		myNodes.append(tempNode.getKey());
	}
}

}
