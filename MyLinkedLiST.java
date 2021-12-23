package java_linkedlist;

public class MyLinkedLiST {
private INode head;
private INode tail;


public MyLinkedList() {
	this.head = null;
    this.tail = null;
}


public void printMyNodes() {
	StringBuffer myNodes = new StringBuffer("My Nodes: ");
	INode tempNode = head;
	while (tempNode.getNext() != null) {
		myNodes.append(tempNode.getKey());
	}
}

}
