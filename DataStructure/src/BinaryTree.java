
public class BinaryTree<E> {
	protected E val;
	protected BinaryTree<E> parent;
	protected BinaryTree<E> left,right;
	public BinaryTree(){
		val = null;
		parent = null;
		left = right = this;
	}
	public BinaryTree(E value){
		Assert.pre(value != null,"Tree value Must be non-null");
		val = value;
		right = left = new BinaryTree<E>();
		setLeft(left);
		setRight(right);
	}
	public BinaryTree(E value,BinaryTree<E> left,BinaryTree<E> right){
		Assert.pre(value != null,"Tree value Must be non-null");
		val = value;
		if(left == null)
			left = new BinaryTree<E>();
		setLeft(left);
		if(right == null)
			right = new BinaryTree<E>();
		setRight(right);
	}
	public BinaryTree<E> left(){
		return left;
	}
	public BinaryTree<E> parent(){}
	public void setLeft(BinaryTree<E> newLeft){
		if(isEmpty())
			return;
		if(left != null && left.parent == this)
			left.setParent(null);
		left = newLeft;
		left.setLeft(this);
	}
	public void setRight(BinaryTree<E> newRight){
		if(isEmpty())
			return;
		if(right != null && right.parent == this)
			right.setParent(null);
		right = newRight;
		right.setLeft(this);
	}
	protected void setParent(BinaryTree<E> newParent) {
		if(!isEmpty())
			parent = newParent;
	}
	public Iterator<E> iterator() {
		
	}
	public boolean isLeftChild(){
		
	}
	public E value(){
		return val;
	}
	public void setValue(E value){
		val = value;
	}
	
}
