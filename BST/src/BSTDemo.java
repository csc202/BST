import java.util.Collection;


public class BSTDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Character> alist;
		Bst <Character>abst = new Bst<Character>();
		abst.add('D');
		abst.add('A');
		abst.add('G');
		abst.add('F');
		alist = abst.traversal(Order.INORDER);
		//ADFG
		System.out.println(alist.toString());
	}

}
