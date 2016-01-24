
public class BTNode <C> {
	private C data;
	private BTNode <C>rightChild;
	private BTNode<C> leftChild;
	
	public BTNode(C initialData, BTNode<C> initialLeftChild, BTNode<C> initialRightChild){
		data = initialData;
		leftChild = initialLeftChild;
		rightChild = initialRightChild;
	}
	//Getter and Setter for Right Child
	public BTNode<C> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BTNode<C> rightChild) {
		this.rightChild = rightChild;
	}
    //Getter and Setter for Left Child
	public BTNode<C> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BTNode<C> leftChild) {
		this.leftChild = leftChild;
	}

	//Getter and Setter for Data
	public C getData() {
		return data;
	}
	
	public void setData(C data) {
		this.data = data;
	}
	
	//Checks if node is a leaf
	public boolean isLeaf(BTNode<C> node){
		if(node.leftChild != null || node.rightChild != null) {
			return false;
		}
		return true;
	}
	//Gets Leftmost Data
	public C getLeftmostData(){
		if(leftChild == null){
			return data;
		}
		else {
			return leftChild.getLeftmostData();
		}
	}
	//Gets Rightmost Data
	public C getRightmostData(){
		if(rightChild == null) {
			return data;
		}
		else{
			return rightChild.getRightmostData();
		}
	}
	
	//Preorder Print
	public void preorderPrint(){
		System.out.println("Preorder Traversal: ");
		System.out.print(data + " ");
		preorderPrint(leftChild);
		preorderPrint(rightChild);
		System.out.println();
		System.out.println();
	}
	private void preorderPrint(BTNode<C> node){
		if(node == null){
			return;
		}
		System.out.print(node.getData() + " ");
		preorderPrint(node.getLeftChild());
		preorderPrint(node.getRightChild());
	}
	
	
	//In-order Print
	public void inorderPrint(){
		System.out.println("Inorder Traversal: ");
	    inorderPrint(leftChild);
	    System.out.print(data + " ");
	    inorderPrint(rightChild);
	    System.out.println();
	    System.out.println();
	  }
	  private void inorderPrint(BTNode<C> node){
		if(node == null) {
			return;
		}
		inorderPrint(node.getLeftChild());
		System.out.print(node.getData() + " ");
		inorderPrint(node.getRightChild());
	
	}
	
	//Post-order Print
	  public void postorderPrint() {
	  	System.out.println("Postorder Traversal: ");
		postorderPrint(leftChild);
	  	postorderPrint(rightChild);
	  	System.out.print(data + " ");
	  	System.out.println();
	  	System.out.println();
	  }
	  private void postorderPrint(BTNode<C> node){
		if(node == null){
			return;
		}
		postorderPrint(node.getLeftChild());
		postorderPrint(node.getRightChild());
		System.out.print(node.getData() + " ");
	}

}
