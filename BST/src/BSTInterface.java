import java.util.Collection;


public interface BSTInterface <T> {
	void add(T element);
	T search(T element) throws BSTUnderflowException;
	T remove(T element) throws BSTUnderflowException;
	boolean contains(T element) throws BSTUnderflowException;
	int size();
	boolean isEmpty();
	Collection<T> traversal(Order order);
}
