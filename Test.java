
public class Test {
	public static void main(String[] args) {
		BTNode<Integer> thirteen = new BTNode<Integer> (13, null, null);
		BTNode<Integer> nineteen = new BTNode<Integer> (19, null, null);
		BTNode<Integer> seven = new BTNode<Integer>(7, null, null);
		BTNode<Integer> nine = new BTNode<Integer>(9, null, thirteen);
		BTNode<Integer> fiftythree = new BTNode<Integer>(53, null, null);
		BTNode<Integer> four = new BTNode<Integer>(4, nineteen, seven);
		BTNode<Integer> seventeen = new BTNode<Integer>(17, nine, fiftythree);
		BTNode<Integer> eleven = new BTNode<Integer>(11, four, null);
		BTNode<Integer> Parent = new BTNode<Integer> (14, seventeen, eleven);
		Parent.preorderPrint();
		Parent.inorderPrint();
		Parent.postorderPrint();
		BTNode<String> C = new BTNode<String> ("C", null, null);
		BTNode<String> D = new BTNode<String> ("D", null, null);
		BTNode<String> F = new BTNode<String> ("F", null, null);
		BTNode<String> B = new BTNode<String> ("B", C, D);
		BTNode<String> E = new BTNode<String> ("E", F, null);
		BTNode<String> A = new BTNode<String> ("A", B, E);
		A.preorderPrint();
		A.inorderPrint();
		A.postorderPrint();
		/*BTNode<String> Imti = new BTNode<String> ("Imti", null, null);
		BTNode<String> Abby = new BTNode<String> ("Abby", null, null);
		BTNode<String> Eman = new BTNode<String> ("Eman", Imti, null);
		BTNode<String> Timmy = new BTNode<String> ("Timmy", null, null);
		BTNode<String> Elizabeth = new BTNode<String>("Elizabeth", Abby, null);
		BTNode<String> Katie = new BTNode<String>("Katie", null, null);
		BTNode<String> Annie = new BTNode<String>("Annie", Eman, Timmy);
		BTNode<String> Tom = new BTNode<String> ("Tom", Elizabeth, Katie);
		BTNode<String> Chelsea = new BTNode<String> ("Chelsea", Annie, Tom);
		Chelsea.preorderPrint();
		Chelsea.inorderPrint();
		Chelsea.postorderPrint();
		System.out.println(Chelsea.isLeaf(Annie));
		System.out.println(Chelsea.getLeftmostData());
		System.out.println(Chelsea.getRightmostData());  
		*/
		BSTNode test = new BSTNode(14, null, null);
		test.insertValue(11);
		test.insertValue(17);
		test.insertValue(4);
		test.insertValue(53);
		test.insertValue(9);
		test.insertValue(7);
		test.insertValue(13);
		test.insertValue(19);
		//System.out.println(test.findMin(test));
		test.inorderPrint();
		test.deleteValue(53);
		test.inorderPrint();
	}
}
