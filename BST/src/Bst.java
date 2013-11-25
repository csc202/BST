import java.util.Collection;
import java.util.LinkedList;

public class Bst<T extends Comparable<T>> implements BSTInterface<T> {
	BSTNode<T> root, current, previous;
	Collection<T> output;

	public Bst() {
		root = null;
	}

	public void add(T element) {
		current = root;
		previous = current;
		while (current != null) {
			if (element.compareTo(current.getElement()) <= 0) {
				// left
				previous = current;
				current = current.getLeft();
				previous.setLeft(current);
			} else {
				// right
				previous = current;
				current = current.getRight();
				previous.setRight(current);
			}
		}
		BSTNode<T> newNode = new BSTNode<T>(element);
		current = newNode;
		
		
		if(isEmpty()) {
			root = current;
		}
	}

	@Override
	public T search(T element) throws BSTUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove(T element) throws BSTUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T element) throws BSTUnderflowException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return root == null;
	}

	@Override
	public Collection<T> traversal(Order order) {
		// TODO Auto-generated method stub
		output = new LinkedList<T>();
		if (!isEmpty()) {
			
			if (order == Order.INORDER) {
				// LRootR
				output.add(getLeftNode(root).getElement());
				output.add(root.getElement());
				output.add(getRightNode(root).getElement());
			} else if (order == Order.POSTORDER) {
				// LRRoot
				output.add(getLeftNode(root).getElement());
				output.add(getRightNode(root).getElement());
				output.add(root.getElement());

			} else if (order == Order.PREORDER) {
				// RootLR
				output.add(root.getElement());
				output.add(getLeftNode(root).getElement());
				output.add(getRightNode(root).getElement());
			}
			return output;
		}
		return output;
	}

	public BSTNode<T> getLeftNode(BSTNode<T> r) {
		if (r.getLeft() == null) {
			return r;
		}
		return getLeftNode(r.getLeft());
	}

	public BSTNode<T> getRightNode(BSTNode<T> r) {
		if (r.getRight() == null) {
			return r;
		}
		return getRightNode(r.getRight());
	}

}
