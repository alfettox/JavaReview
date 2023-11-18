class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class PreorderBST {
    int index = 0;

    public TreeNode constructBST(int[] arr) {
        return constructBST(arr, Integer.MAX_VALUE);
    }

    private TreeNode constructBST(int[] arr, int bound) {
        if (index >= arr.length || arr[index] > bound) {
            return null;                    //STOP THE CREATION IF INDEX OUT OF BOUND OR WE HAVE AS A BOUND PARENT.VALUE AND CURR ELEMENT IS BIGGER THAN THAT
        }

        TreeNode root = new TreeNode(arr[index]);
        index++;
        root.left = constructBST(arr, root.val);
        root.right = constructBST(arr, bound);

        return root;
    }

    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        PreorderBST solution = new PreorderBST();

        int[] arr = {1,3,5,4,5};
        TreeNode root = solution.constructBST(arr);

        System.out.print("In-order traversal of constructed BST: ");
        solution.inOrderTraversal(root);
    }
}
/*
  1
     \
      3
       \
        5
       / \
      4   5
 */