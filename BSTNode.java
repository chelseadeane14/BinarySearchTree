
public class BSTNode extends BTNode<Integer>{
	public BSTNode(int initialData, BSTNode initialLeft, BSTNode initialRight) {
		super(initialData, initialLeft, initialRight);
	}
	
	//equivalent to getLeft(), typecasting from BTNode<Integer> to BSTNode
	private BSTNode left(){
		return (BSTNode)getLeftChild();
	}
	
	private BSTNode right() {
		return (BSTNode)getRightChild();
	}
	
	public boolean search(int value){
		if(getData() == null) {
		//	System.out.println("false");
			return false;
		}
		if(getData() == value) {
			return true;
		}
		if(value < getData()) {
			if(left() == null){
			//	System.out.println("false");
				return false;
			}
			return left().search(value);
		}
		if(value > getData()){
			if(right() == null) {
				//System.out.println("false");
				return false;
			}
			return right().search(value);
		}
		//System.out.println("true");
		return false;
		
	}

	public void insertValue(int value){ 
		BSTNode c = new BSTNode (value, null, null);
		if (value >= getData()) {
            if (right() == null) {
                this.setRightChild(c);
                return;
            }
            else {
                right().insertValue(value);
            }
        }
        if (value < getData()) {
            if (left() == null) {
                this.setLeftChild(c);
                return;
            }
            else {
                left().insertValue(value);
            }
        }
    }
	//Method for finding the minimum value
	public int findMin(BSTNode c){
		  if ( c == null ){
			  return 0;
		  }
		  BSTNode current = c;
		  while(current.left() != null){
		    current = current.left();
		  }
		  return current.getData();
		}

	public BSTNode deleteValue(int value){
		/*Case 1: No Children
		 * Set corresponding parent to null
		//Case 2: One Child
		 * Link the child to the parent of the removed node
		//Case 3: Two Children
		 * Find the minimum value of the right subtree
		 * Replace the value of the node to be removed with minimum
		 * Apply remove to the right subtree to remove duplicate
		 */
		deleteValue(this, value);
		return this;
	}
	private BSTNode deleteValue(BSTNode c, int value) {
    	if (c == null) {
        	return null;
    	}
    	if (value == c.getData()) {
        //Remove node from c
    		// Case 1:
        	if (c.left() == null && c.right() == null) {
            	return null;
        	}
        	//Case 2:
        	else if (c.left() == null) {
            	return c.right();
        	}
        	else if (c.right() == null) {
            	return c.left();
        	}
        	//Case 3:
        	int min = findMin(c.right());
        	c.setData(min);
        	c.setRightChild(deleteValue(c.right(), min));
        	return c; 
    	}
    	//When value does not equal data, recursively search for value.
    	else if (value < c.getData()) {
        	c.setLeftChild(deleteValue(c.left(), value));
        	return c;
    	}
    	else {
        	c.setRightChild(deleteValue(c.right(), value));
        	return c;
    	}
	}
}
