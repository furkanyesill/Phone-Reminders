package veriYapilari;

public class LinkedList {
	Node root;

	void add(String x) {
		Node temp = new Node(x);

		if (root == null) {
			root = temp;
		} else {
			Node last = root;
			while (last.next != null) {
				last = last.next;
			}
			last.next = temp;
		}
	}
}
