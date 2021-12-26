package java_linkedlist;

public class MyNode<k> implements INode<k>
{
	private k key;
	private INode next;
	
	public MyNode(k key) {
		this.key = key;
		this.next = null;
	}
	
	public INode getNext() {
		return next;
	}
	
	public void setNext(INode next) {
		this.next = next;
	}
}
