# Pre-order BST Construction

This Java program demonstrates the construction of a Binary Search Tree (BST) from a pre-order traversal sequence. The solution follows the approach of comparing each element with previously visited nodes to ensure the BST property.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/preorder-bst-java.git
   cd preorder-bst-java

    Compile and run the Java program:

    javac PreorderBST.java
    java PreorderBST

    View the in-order traversal of the constructed BST:

    The program includes an example usage with a pre-order sequence. The in-order traversal of the constructed BST is printed to the console.

Understanding the Code
TreeNode Class

      class TreeNode {
      int val;
      TreeNode left, right;
      
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }

The TreeNode class represents a node in the BST.
PreorderBST Class


      public class PreorderBST {
      int index = 0;
   
      }

The PreorderBST class contains the main logic for constructing a BST from a pre-order traversal.
constructBST Method


      public TreeNode constructBST(int[] preorder) {
      return constructBST(preorder, Integer.MAX_VALUE);
      }

      private TreeNode constructBST(int[] preorder, int bound) {
      if (index == preorder.length || preorder[index] > bound) {
      return null;
      }

    TreeNode root = new TreeNode(preorder[index++]);
    root.left = constructBST(preorder, root.val);
    root.right = constructBST(preorder, bound);

    return root;
}

The constructBST method is a recursive function that constructs the BST while traversing the pre-order sequence. It takes two parameters: the preorder array and an upper bound bound. The bound is a limit for the values that can be inserted into the current subtree, ensuring the BST property.
inOrderTraversal Method


      public void inOrderTraversal(TreeNode root) {
      if (root != null) {
      inOrderTraversal(root.left);
      System.out.print(root.val + " ");
      inOrderTraversal(root.right);
      }
      }

The inOrderTraversal method is a utility function to print the in-order traversal of the constructed BST.
Example Usage


      public static void main(String[] args) {
      PreorderBST solution = new PreorderBST();
      
          // Example usage:
          int[] preorder = {8, 5, 1, 7, 10, 12};
          TreeNode root = solution.constructBST(preorder);
      
          // Verify the constructed BST using in-order traversal
          System.out.print("In-order traversal of constructed BST: ");
          solution.inOrderTraversal(root);
      }

In the example, a pre-order sequence {8, 5, 1, 7, 10, 12} is used to construct a BST. The bound parameter ensures the correct insertion of elements while maintaining the order.