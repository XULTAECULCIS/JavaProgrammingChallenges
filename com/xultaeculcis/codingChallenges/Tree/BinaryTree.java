package com.xultaeculcis.codingChallenges.Tree;

import java.util.*;

/**
 * Created by sicluceatlux on 2017-04-15.
 */
public class BinaryTree {
	
	
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data) {
			this.data = data;
		}
	}
	
	// Recursive Solution
	public void preorder(TreeNode root) {
		if (root != null) {
			//Visit the node-Printing the node data
			System.out.printf("%d ", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	// Iterative solution
	public void preorderIter(TreeNode root) {
		
		if (root == null)
			return;
		
		Stack stack = new Stack();
		stack.push(root);
		
		while (!stack.empty()) {
			
			TreeNode n = (TreeNode) stack.pop();
			System.out.printf("%d ", n.data);
			
			
			if (n.right != null) {
				stack.push(n.right);
			}
			if (n.left != null) {
				stack.push(n.left);
			}
			
		}
		
	}
	
	// Recursive Solution
	public void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			//Visit the node by Printing the node data
			System.out.printf("%d ", root.data);
		}
	}
	
	// Iterative solution
	public void postorderIter(TreeNode root) {
		if (root == null)
			return;
		
		Stack s = new Stack();
		TreeNode current = root;
		
		while (true) {
			
			if (current != null) {
				if (current.right != null)
					s.push(current.right);
				s.push(current);
				current = current.left;
				continue;
			}
			
			if (s.isEmpty())
				return;
			current = (TreeNode) s.pop();
			
			if (current.right != null && !s.isEmpty() && current.right == s.peek()) {
				s.pop();
				s.push(current);
				current = current.right;
			}
			else {
				System.out.print(current.data + " ");
				current = null;
			}
		}
	}
	
	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			//Visit the node by Printing the node data
			System.out.printf("%d ", root.data);
			inOrder(root.right);
		}
	}
	
	public void inOrderIter(TreeNode root) {
		
		if (root == null)
			return;
		
		Stack s = new Stack();
		TreeNode currentNode = root;
		
		while (!s.empty() || currentNode != null) {
			
			if (currentNode != null) {
				s.push(currentNode);
				currentNode = currentNode.left;
			}
			else {
				TreeNode n = (TreeNode) s.pop();
				System.out.printf("%d ", n.data);
				currentNode = n.right;
			}
		}
	}
	
	// prints in level order
	public void levelOrderTraversal(TreeNode startNode) {
		Queue queue = new LinkedList();
		queue.add(startNode);
		while (!queue.isEmpty()) {
			TreeNode tempNode = (TreeNode) queue.poll();
			System.out.printf("%d ", tempNode.data);
			if (tempNode.left != null)
				queue.add(tempNode.left);
			if (tempNode.right != null)
				queue.add(tempNode.right);
		}
	}
	
	// prints in Spiral/Zigzag level order
	public void spiralOrZigzagLevelOrder(TreeNode root) {
		if (root == null)
			return;
		Stack stack = new Stack();
		stack.push(root);
		
		boolean directionflag = false;
		while (!stack.isEmpty()) {
			Stack tempStack = new Stack();
			
			while (!stack.isEmpty()) {
				TreeNode tempNode = (TreeNode) stack.pop();
				System.out.printf("%d ", tempNode.data);
				if (!directionflag) {
					if (tempNode.left != null)
						tempStack.push(tempNode.left);
					if (tempNode.right != null)
						tempStack.push(tempNode.right);
				}
				else {
					if (tempNode.right != null)
						tempStack.push(tempNode.right);
					if (tempNode.left != null)
						tempStack.push(tempNode.left);
				}
			}
			// for changing direction
			directionflag = !directionflag;
			
			stack = tempStack;
		}
		
	}
	
	// prints in reverse level order
	public void reverseLevelOrderTraversal(TreeNode startNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		queue.add(startNode);
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			if (tempNode.right != null)
				queue.add(tempNode.right);
			if (tempNode.left != null)
				queue.add(tempNode.left);
			
			stack.push(tempNode);
		}
		
		while (!stack.empty()) { System.out.print(stack.pop().data + " "); }
	}
	
	private static void printLeftEdgeNodes(TreeNode root) {
		if (root == null)
			return;
		
		// if leaf node, ignore while printing edges
		if (root.left == null && root.right == null)
			return;
		
		System.out.print(root.data + " ");
		
		// If left is null, right will be the boundary edge.
		if (root.left == null) {
			printLeftEdgeNodes(root.right);
		}
		else {
			printLeftEdgeNodes(root.left);
		}
		
	}
	
	
	private static void printLeafNodes(TreeNode root) {
		if (root == null)
			return;
		
		if (root.left == null && root.right == null) {
			System.out.print(root.data + " ");
			return;
		}
		printLeafNodes(root.left);
		printLeafNodes(root.right);
	}
	
	private static void printRightBottomUp(TreeNode root) {
		if (root == null)
			return;
		
		// if leaf node, ignore while printing edges
		if (root.left == null && root.right == null) {
			return;
		}
		
		if (root.right != null) {
			printRightBottomUp(root.right);
		}
		else if (root.left != null) {
			printRightBottomUp(root.left);
		}
		
		System.out.print(root.data + " ");
	}
	
	public void boundaryLevelTraversal(TreeNode root) {
		System.out.print(root.data + " ");
		printLeftEdgeNodes(root.left);
		printLeafNodes(root);
		printRightBottomUp(root.right);
		
	}
	
	/* To get the count of leaf nodes in a binary tree*/
	public int getLeafCountOfBinaryTree(TreeNode node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			return getLeafCountOfBinaryTree(node.left) + getLeafCountOfBinaryTree(node.right);
	}
	
	public int getMaximumRec(TreeNode root) {
		int max = Integer.MIN_VALUE;
		int value = 0;
		int left, right;
		if (root != null) {
			value = root.data;
			left = getMaximumRec(root.left);
			right = getMaximumRec(root.right);
			
			if (left > right) {
				max = left;
			}
			else {
				max = right;
			}
			
			if (max < value) {
				max = value;
			}
		}
		
		return max;
	}
	
	// Iterative Solution
 /* To get max node in a binary tree*/
	public static int getMaximumItr(TreeNode startNode) {
		
		Queue queue = new LinkedList();
		queue.add(startNode);
		int max = Integer.MIN_VALUE;
		while (!queue.isEmpty()) {
			TreeNode tempNode = (TreeNode) queue.poll();
			if (max < tempNode.data)
				max = tempNode.data;
			if (tempNode.left != null)
				queue.add(tempNode.left);
			if (tempNode.right != null)
				queue.add(tempNode.right);
		}
		return max;
	}
	
	public static void printArray(int[] path, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(" " + path[i]);
		}
		System.out.println();
	}
	
	
	// Prints all paths to leaf
	public void printAllPathsToLeaf(TreeNode node, int[] path, int len) {
		if (node == null)
			return;
		
		// storing data in array
		path[len] = node.data;
		len++;
		
		if (node.left == null && node.right == null) {
			// leaf node is reached
			printArray(path, len);
			return;
		}
		
		printAllPathsToLeaf(node.left, path, len);
		printAllPathsToLeaf(node.right, path, len);
	}
	
	// prints vertical sum in binary tree
	public void printVertivalSumOfBinaryTree(TreeNode startNode, TreeMap<Integer, Integer> treeNodeMap, int level) {
		if (startNode == null) {
			return;
		}
		
		// Decrease level by 1 when iterating left child
		printVertivalSumOfBinaryTree(startNode.left, treeNodeMap, level - 1);
		
		if (treeNodeMap.get(level) != null) {
			// Adding current node data to previous stored value to get the sum
			Integer sum = treeNodeMap.get(level) + startNode.data;
			treeNodeMap.put(level, sum);
		}
		else {
			
			treeNodeMap.put(level, startNode.data);
		}
		// Increase level by 1 when iterating left child
		printVertivalSumOfBinaryTree(startNode.right, treeNodeMap, level + 1);
		
	}
	
	/* To get level of node in a binary tree*/
	public int getLevelOfNode(TreeNode root, int key, int level) {
		if (root == null)
			return 0;
		if (root.data == key)
			return level;
		
		int result = getLevelOfNode(root.left, key, level + 1);
		if (result != 0) {
			// If found in left subtree , return
			return result;
			
		}
		result = getLevelOfNode(root.right, key, level + 1);
		
		return result;
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
		if (root == null)
			return null;
		if (root.data == a.data || root.data == b.data)
			return root;
		
		TreeNode left = lowestCommonAncestor(root.left, a, b);
		TreeNode right = lowestCommonAncestor(root.right, a, b);
		
		// If we get left and right not null , it is lca for a and b
		if (left != null && right != null)
			return root;
		if (left == null)
			return right;
		else
			return left;
		
	}
	
	public static void main(String[] args) {
		BinaryTree bi = new BinaryTree();
		// Creating a binary tree
		TreeNode rootNode = createBinaryTree();
		System.out.println("PreOrder Using Recursive solution:");
		
		bi.preorder(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("PreOrder Using Iterative solution:");
		
		bi.preorderIter(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("PostOrder Using Recursive solution:");
		
		bi.postOrder(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("PostOrder Using Iterative solution:");
		
		bi.postorderIter(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("InOrder Using Recursive solution:");
		
		bi.inOrder(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("InOrder Using Iterative solution:");
		
		bi.inOrderIter(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("LevelOrder:");
		
		bi.levelOrderTraversal(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("ZigzagLevelOrder:");
		
		bi.spiralOrZigzagLevelOrder(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("ReverseLevelOrder:");
		
		bi.reverseLevelOrderTraversal(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("BoundraryLevelOrder:");
		
		bi.boundaryLevelTraversal(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("LeafCount in the tree:");
		
		System.out.println(bi.getLeafCountOfBinaryTree(rootNode));
		
		System.out.println("-------------------------\nMax val in the tree rec is: " + bi.getMaximumRec(rootNode) +
				"\n-------------------------");
		System.out.println(
				"Max val in the tree iter is: " + bi.getMaximumItr(rootNode) + "\n-------------------------");
		
		System.out.println("Printing all paths from root to leaf :");
		bi.printAllPathsToLeaf(rootNode, new int[1000], 0);
		
		System.out.println("Vertical sum of binary tree will be:");
		TreeMap<Integer, Integer> treeNodeMap = new TreeMap<>();
		bi.printVertivalSumOfBinaryTree(rootNode, treeNodeMap, 0);
		
		for (Map.Entry<Integer, Integer> entry : treeNodeMap.entrySet()) { System.out.println(entry.getValue()); }
		
		
		System.out.println("Node data: 70,Level :" + bi.getLevelOfNode(rootNode, 70, 1));
		System.out.println("Node data: 100,Level :" + bi.getLevelOfNode(rootNode, 100, 1));
		System.out.println("Node data: 60,Level :" + bi.getLevelOfNode(rootNode, 60, 1));
		System.out.println("Node data: 40,Level :" + bi.getLevelOfNode(rootNode, 40, 1));
		
		System.out.println("--------------------");
		System.out.println("Lowest common ancestor for node 5 and 30:");
		TreeNode node5=new TreeNode(5);
		TreeNode node30=new TreeNode(30);
		System.out.println(bi.lowestCommonAncestor(rootNode,node5,node30).data);
	}
	
	public static TreeNode createBinaryTree() {
		
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);
		
		rootNode.left = node20;
		rootNode.right = node60;
		
		node20.left = node10;
		node20.right = node30;
		
		node60.left = node50;
		node60.right = node70;
		
		return rootNode;
	}
	
	
}
