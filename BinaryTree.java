import java.util.*;
public class BinaryTree {

    Node root;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(Node node) {
        if (node == null) return;
        System.out.printf("[%d]", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(Node node) {
        if (node == null) return;
        inTraverse(node.left);
        System.out.printf("[%d]", node.data);
        inTraverse(node.right);
    }

    public void postTraverse(Node node) {
        if (node == null) return;
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%d]", node.data);
    }
    
    public int countNode(Node node) {

    if(node == null)
        return 0;

    return 1
        + countNode(node.left)
        + countNode(node.right);
    }

    public int countLeaf(Node node) {

    if(node == null)
        return 0;

    if(node.left == null &&
       node.right == null)
        return 1;

    return countLeaf(node.left)
         + countLeaf(node.right);
    }

    public int height(Node node) {

    if(node == null)
        return 0;

    int kiri = height(node.left);
    int kanan = height(node.right);

    return 1 + Math.max(kiri, kanan);
    }

    public void levelTraverse(Node root) {

    if (root == null)
        return;

    Queue<Node> queue = new LinkedList<>();

    queue.offer(root);

    while (!queue.isEmpty()) {

        Node current = queue.poll();

        System.out.printf("[%d]", current.data);

        if (current.left != null)
            queue.offer(current.left);

        if (current.right != null)
            queue.offer(current.right);
    }
}

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        for(int i = 0; i < 10; i++) {
            int nilai = (int)(Math.random() * 100);
            System.out.printf(
            "Nilai %d dimasukkan\n",
            nilai
        );
       
        tree.add(nilai);
    }

    System.out.print("Preorder : ");
    tree.preTraverse(tree.root);
    
    System.out.println();

    System.out.print("Inorder : ");
    tree.inTraverse(tree.root);

    System.out.println();

    System.out.print("Postorder : ");
    tree.postTraverse(tree.root);

    System.out.println();
    
    System.out.print("Level Order : ");
    tree.levelTraverse(tree.root);

    System.out.println(
    "\nJumlah Node = "
    + tree.countNode(tree.root));

    System.out.println(
    "Jumlah Leaf = "
    + tree.countLeaf(tree.root));
    
    System.out.println(
    "Tinggi Tree = "
    + tree.height(tree.root));

    

    }

}