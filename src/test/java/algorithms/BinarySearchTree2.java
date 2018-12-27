package algorithms;

import algorithms.BinarySearchTree.Node;

public class BinarySearchTree2 {
	
	
	public BinarySearchTree2(Node root) {
		super();
		this.root = null;
	}

	public BinarySearchTree2() {
		this.root = null;
	}

	public class Node{
		private int key;
		private String value;
		public Node left, right;
		
		
		public Node(int key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	Node root = null;

	public void insert(int key, String value) {
	
		root = insertItem(root, key, value);

	}
	
	public Node insertItem(Node node, int key, String value) {
		
		Node newNode = new Node(key, value);
		if(node == null) {
			node = newNode;
			return node;
		}
		
		if(key  < node.key) {
			node.left = insertItem(node.left, key, value);
		}
		if(key  > node.key) {
			node.right = insertItem(node.right, key, value);
		}
		return node;
	
	}
	
	
	
	
	public Node find(Node node, int key) {
		
		if(node == null || node.key == key )
		return node;
		
		if( key < node.key) {
			return find(node.left, key);
		}
		if(key > node.key) {
			 return find(node.right, key);
		}
		
		return null;
	}

	public String find(int key) {
		Node find = find(root, key);
		if(find!=null)
		return find.value;
		return null;
	}
	
	
	public int findMinKey() {
		Node node = min(root);
		return node.key;
		
	}

	private Node min(Node node) {
		if (node == null )
			return null;
		while (node.left != null) {
			node = node.left;
			min(node);
		}
		return node;

	}
	
	   public Node findMin(Node node) {
	        return min(node);
	    }

	
	public void delete(int key) {
		
		root = delete(root, key);

	}
	
	private Node delete(Node node, int key) {
		if (node != null && key < node.key) {

			node.left = delete(node.left, key);
		}

		if (node != null && key > node.key) {

			node.right = delete(node.right, key);
		}

		else {
			if (node.left == null && node.right == null)
				return node = null;
			else if(node.left == null) {
				node = node.right;
			}else if(node.right == null) {
				node = node.left;
			}
		 else {
			
			Node minRightNode = findMin(node.right);
			
			node.key=minRightNode.key;
			node.value=minRightNode.value;
			
			node.right = delete(node.right,node.key);
		//	node.right = null;
		}
//		return node;

	}
		return node;
	}
	
    public void prettyPrint() {
        // Hard coded print out of binary tree depth = 3

        int rootLeftKey = root.left == null ? 0 : root.left.key;
        int rootRightKey = root.right == null ? 0 : root.right.key;

        int rootLeftLeftKey = 0;
        int rootLeftRightKey = 0;

        if (root.left != null) {
            rootLeftLeftKey = root.left.left == null ? 0 : root.left.left.key;
            rootLeftRightKey = root.left.right == null ? 0 : root.left.right.key;
        }

        int rootRightLeftKey = 0;
        int rootRightRightKey = 0;

        if (root.right != null) {
            rootRightLeftKey = root.right.left == null ? 0 : root.right.left.key;
            rootRightRightKey = root.right.right == null ? 0 : root.right.right.key;
        }

        System.out.println("     " + root.key);
        System.out.println("   /  \\");
        System.out.println("  " + rootLeftKey + "    " + rootRightKey);
        System.out.println(" / \\  / \\");
        System.out.println(rootLeftLeftKey + "  " + rootLeftRightKey + " " + rootRightLeftKey + "   " + rootRightRightKey);
    }

	public void printInOrderTraversal() {
		printInOrder(root);		
	}
	
	public void printInOrder(Node node) {
		if (node != null) {
			printInOrder(node.left);
			System.out.println(node.key);
			printInOrder(node.right);
		}
	}

	public void printPreOrderTraversal() {
		printPreOrder(root);
		
	}

	private void printPreOrder(Node node) {
		if(node!=null) {
			System.out.println(node.key);
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
		
	}

	public void printPostOrderTraversal() {
		printPostOrder(root);
		
	}

	private void printPostOrder(Node node) {
		if(node!=null) {		
			printPreOrder(node.left);
			printPreOrder(node.right);
			System.out.println(node.key);
		}
		
		
	}
}
